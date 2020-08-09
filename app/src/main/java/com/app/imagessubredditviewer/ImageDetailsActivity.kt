package com.app.imagessubredditviewer

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.imageloader.ImageLoader

class ImageDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_details)

        val bundle = intent.extras
        val IMAGE_URL = "IMAGE_URL"
        val url = bundle!!.getString(IMAGE_URL)
        val imageView =
            findViewById<ImageView>(R.id.ivDetails)
        val imageName = findViewById<TextView>(R.id.textView)

        if (url != null) {
            ImageLoader[this]
                ?.loadUrl(url)
                ?.target(imageView)
                ?.addListener(object : ImageLoader.ImageListener {
                   override fun result(result: Boolean, message: String?) {
                        imageName.text = message
                    }
                })?.execute()
        }

    }
}