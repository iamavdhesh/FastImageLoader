package com.app.imageloader

import java.io.InputStream
import java.io.OutputStream

object Util {
    fun copyStream(stream: InputStream, os: OutputStream) {
        val bufferSize = 1024
        try {
            val bytes = ByteArray(bufferSize)
            while (true) {
                val count = stream.read(bytes, 0, bufferSize)
                if (count == -1) break
                os.write(bytes, 0, count)
            }
        } catch (ex: Exception) {
        }
    }
}