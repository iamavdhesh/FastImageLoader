package com.app.imageloader.cache

import android.graphics.Bitmap
import android.util.Log
import java.util.*
import kotlin.collections.LinkedHashMap

/**
 *  Created by Avdhesh Kumar on 09/08/2020
 *
 */

class MemoryCache {
    private val cache = Collections.synchronizedMap(
        LinkedHashMap<String, Bitmap>(10, 1.5f, true)
    ) //Last argument true for LRU ordering
    private var size: Long = 0 //current allocated size
    private var limit: Long = 1000000 //max memory in bytes
    fun setLimit(new_limit: Long) {
        limit = new_limit
        Log.i(
            TAG,
            "MemoryCache will use up to " + limit / 1024.0 / 1024.0 + "MB"
        )
    }

    operator fun get(id: String?): Bitmap? {
        return try {
            if (!cache.containsKey(id)) null else cache.get(id)
            //NullPointerException sometimes happen here http://code.google.com/p/osmdroid/issues/detail?id=78
        } catch (ex: NullPointerException) {
            ex.printStackTrace()
            null
        }
    }

    fun put(id: String?, bitmap: Bitmap?) {
        try {
            if (cache.containsKey(id)) size -= getSizeInBytes(cache.get(id))
            cache.put(id, bitmap)
            size += getSizeInBytes(bitmap)
            checkSize()
        } catch (th: Throwable) {
            th.printStackTrace()
        }
    }

    private fun checkSize() {
        Log.i(
            TAG,
            "checkSize: " + size + " length=" + cache.size
        )
        if (size > limit) {
            val iter: MutableIterator<Map.Entry<String, Bitmap>> = cache.entries.iterator() //least recently accessed item will be the first one iterated
            while (iter.hasNext()) {
                val entry: Map.Entry<String, Bitmap> = iter.next()
                size -= getSizeInBytes(entry.value)
                iter.remove()
                if (size <= limit) break
            }
            Log.i(
                TAG,
                "checkSize: Clean cache. New size" + cache.size
            )
        }
    }

    fun clear() {
        try {
            //NullPointerException sometimes happen here http://code.google.com/p/osmdroid/issues/detail?id=78
            cache.clear()
            size = 0
        } catch (ex: NullPointerException) {
            ex.printStackTrace()
        }
    }

    private fun getSizeInBytes(bitmap: Bitmap?): Long {
        return if (bitmap == null) 0 else (bitmap.rowBytes * bitmap.height).toLong()
    }

    companion object {
        private const val TAG = "MemoryCache"
    }

    init {
        setLimit(Runtime.getRuntime().maxMemory() / 4)
    }
}