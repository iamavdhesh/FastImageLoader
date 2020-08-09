package com.app.imagessubredditviewer.utils

import android.content.Context
import android.net.ConnectivityManager


object NetworkUtils{
     fun isNetworkConnected(context: Context): Boolean {
        val cm: ConnectivityManager =context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return cm.activeNetworkInfo != null && cm.activeNetworkInfo!!.isConnected
    }

}