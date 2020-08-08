package com.app.imageloader

import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import android.widget.ImageView
import androidx.annotation.UiThread
import com.app.imageloader.cache.FileCache
import com.app.imageloader.cache.MemoryCache
import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import java.util.*
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors


class ImageLoader private constructor(context: Context) {
    private val memoryCache: MemoryCache = MemoryCache()
    private val fileCache: FileCache
    private val imageViewMap =
        Collections.synchronizedMap(WeakHashMap<ImageView, String>())
    private val executorService: ExecutorService
    private var targetUrl: String? = null
    private var imageView: ImageView? = null
    private var imageListener: ImageListener? = null
    fun loadUrl(targetUrl: String?): ImageLoader {
        this.targetUrl = targetUrl
        return this
    }

    fun addListener(imageListener: ImageListener?): ImageLoader {
        if (imageListener != null) {
            this.imageListener = imageListener
        }
        return this
    }

    fun target(imageView: ImageView?): ImageLoader {
        this.imageView = imageView
        return this
    }

    fun execute() {
        if (imageView == null) {
            showResult(false, "View is null")
            return
        } else if (targetUrl == null) {
            showResult(false, "URL is null")
            return
        }
        imageViewMap[imageView!!] = targetUrl!! // Map will ignore if already exist
        val bitmap: Bitmap? = memoryCache[targetUrl]
        if (bitmap != null) {
            imageView!!.setImageBitmap(bitmap)
            showResult(true, "Loaded from memory cache")
        } else {
            queuePhoto(targetUrl!!, imageView!!)
        }
    }

    private fun queuePhoto(url: String, imageView: ImageView) {
        val p = PhotoToLoad(url, imageView)
        executorService.submit(PhotosLoader(p))
    }

    private fun getBitmap(url: String): Bitmap? {
        val f: File = fileCache.getFile(url)

        //from SD cache
        val b = decodeFile(f)
        if (b != null) {
            showResult(true, "Loaded from disc cache")
            return b
        }

        //from web
        return try {
            var bitmap: Bitmap? = null
            val imageUrl = URL(url)
            val conn =
                imageUrl.openConnection() as HttpURLConnection
            conn.connectTimeout = 30000
            conn.readTimeout = 30000
            conn.instanceFollowRedirects = true
            val `is` = conn.inputStream
            val os: OutputStream = FileOutputStream(f)
            Util.copyStream(`is`, os)
            os.close()
            bitmap = decodeFile(f)
            if (bitmap == null) showResult(false, "Unable to load URL") else showResult(
                true,
                "Fetched form URL"
            )
            bitmap
        } catch (ex: Throwable) {
            ex.printStackTrace()
            if (ex is OutOfMemoryError) memoryCache.clear()
            null
        }
    }

    //decodes image and scales it to reduce memory consumption
    // Ref: https://android.jlelse.eu/loading-large-bitmaps-efficiently-in-android-66826cd4ad53
    // Ref: https://developer.android.com/topic/performance/graphics/load-bitmap
    private fun decodeFile(f: File): Bitmap? {
        try {
            //decode image size
            val o = BitmapFactory.Options()
            o.inJustDecodeBounds = true
            BitmapFactory.decodeStream(FileInputStream(f), null, o)
            //decode with inSampleSize
            val o2 = BitmapFactory.Options()
            o2.inSampleSize = calculateInSampleSize(o2, 100, 100)
            return BitmapFactory.decodeStream(FileInputStream(f), null, o2)
        } catch (e: FileNotFoundException) {
        }
        return null
    }

    //endregion
    @UiThread
    private fun showResult(result: Boolean, message: String) {
        if (imageListener != null) imageView!!.post { imageListener!!.result(result, message) }
        Log.i(TAG, "showResult: $message")
    }

    //Task for the queue
    internal inner class PhotoToLoad internal constructor(
        var url: String,
        var imageView: ImageView
    )

    internal inner class PhotosLoader(var photoToLoad: PhotoToLoad) : Runnable {
        override fun run() {
            if (imageViewReused(photoToLoad)) return
            val bmp = getBitmap(photoToLoad.url)
            memoryCache.put(photoToLoad.url, bmp)
            if (imageViewReused(photoToLoad)) return
            val bd = BitmapDisplayer(bmp, photoToLoad)
            val a = photoToLoad.imageView.context as Activity
            a.runOnUiThread(bd)
        }

    }

    private fun imageViewReused(photoToLoad: PhotoToLoad): Boolean {
        val tag = imageViewMap[photoToLoad.imageView]
        return if (tag == null || tag != photoToLoad.url) true else false
    }

    //Used to display bitmap in the UI thread
    internal inner class BitmapDisplayer(var bitmap: Bitmap?, var photoToLoad: PhotoToLoad) :
        Runnable {
        override fun run() {
            if (imageViewReused(photoToLoad)) return
            if (bitmap != null) {
                photoToLoad.imageView.setImageBitmap(bitmap)
            }
        }

    }

    fun clearCache() {
        memoryCache.clear()
        fileCache.clear()
    }

    interface ImageListener {
        fun result(result: Boolean, message: String?)
    }

    companion object {
        private const val TAG = "ImageLoader"
        private var INSTANCE: ImageLoader? = null
        operator fun get(context: Context): ImageLoader? {
            if (INSTANCE == null) {
                INSTANCE = ImageLoader(context)
            }
            return INSTANCE
        }

        fun calculateInSampleSize(
            options: BitmapFactory.Options, reqWidth: Int, reqHeight: Int
        ): Int {
            // Raw height and width of image
            val height = options.outHeight
            val width = options.outWidth
            var inSampleSize = 1
            if (height > reqHeight || width > reqWidth) {
                val halfHeight = height / 2
                val halfWidth = width / 2

                // Calculate the largest inSampleSize value that is a power of 2 and keeps both
                // height and width larger than the requested height and width.
                while (halfHeight / inSampleSize >= reqHeight
                    && halfWidth / inSampleSize >= reqWidth
                ) {
                    inSampleSize *= 2
                }
            }
            return inSampleSize
        }
    }

    init {
        fileCache = FileCache(context)
        executorService = Executors.newFixedThreadPool(5)
    }
}


