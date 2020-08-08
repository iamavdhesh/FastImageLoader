package com.app.imagessubredditviewer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.app.imageloader.ImageLoader
import com.app.imagessubredditviewer.R
import kotlinx.android.synthetic.main.row_image.view.*

/**
 * Created by Avdhesh Kumar  on 09/08/2020
 *
 */

class RedditImageAdapter : RecyclerView.Adapter<RedditImageAdapter.MyImageHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyImageHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.row_image,parent,false)
        return MyImageHolder(view);

    }

    override fun getItemCount(): Int {
        return 0;
    }

    override fun onBindViewHolder(holder: MyImageHolder, position: Int) {

        ImageLoader.get(holder.ivImage.context)?.loadUrl("")?.target(holder.ivImage)?.execute()

    }

    inner  class  MyImageHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

       var ivImage:ImageView = itemView.ivReddit


    }

}
