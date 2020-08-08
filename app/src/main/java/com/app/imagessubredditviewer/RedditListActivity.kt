package com.app.imagessubredditviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.imagessubredditviewer.adapter.RedditImageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class RedditListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setAdapter()


    }

    private fun setAdapter() {

        with(rvImageList){

            layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL,false)
            adapter = RedditImageAdapter()

        }

    }
}