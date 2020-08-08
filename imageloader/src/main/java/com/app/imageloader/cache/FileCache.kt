package com.app.imageloader.cache

import android.content.Context
import android.os.Environment
import com.app.imageloader.R
import java.io.File

/**
 *  Created by Avdhesh Kumar on 09/08/2020
 *  This file use for maintain cache into  file storage
 *
 */


class FileCache(context: Context) {
    private var cacheDir: File? = null
    fun getFile(url: String): File {
        val filename = url.hashCode().toString()
        return File(cacheDir, filename)
    }

    fun clear() {
        val files = cacheDir!!.listFiles() ?: return
        for (f in files) f.delete()
    }

    init {
        cacheDir = if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED) File(
            Environment.getExternalStorageDirectory(),
            context.getString(R.string.app_name)
        ) else context.cacheDir
        if (!cacheDir!!.exists()) cacheDir!!.mkdirs()
    }
}