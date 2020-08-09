package com.app.imagessubredditviewer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.app.imageloader.ImageLoader
import com.app.imagessubredditviewer.R
import com.app.imagessubredditviewer.models.RedditResponseModel
import kotlinx.android.synthetic.main.row_image.view.*

/**
 * Created by Avdhesh Kumar  on 09/08/2020
 *
 */

class RedditImageAdapter : RecyclerView.Adapter<RedditImageAdapter.MyImageHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyImageHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_image, parent, false)
        return MyImageHolder(view)

    }

    override fun getItemCount(): Int {
        return childrenList?.size ?: 0
    }

    override fun onBindViewHolder(holder: MyImageHolder, position: Int) {

        try {
            ImageLoader[holder.ivImage.context]
                ?.loadUrl(childrenList?.get(position)?.data?.thumbnail)?.target(holder.ivImage)
                ?.execute()
        } catch (e: Exception) {

        }
    }

    var childrenList: MutableList<RedditResponseModel.Data.Children>? = arrayListOf()
    fun setRecords(children: List<RedditResponseModel.Data.Children>?) {
        if (children != null) {
            this.childrenList?.addAll(children)
            notifyDataSetChanged()
        }

    }

    interface OnItemClickListener {

        fun onItemClicked(position: Int, childItem: RedditResponseModel.Data.Children?)
    }

    var onItemClickListener: OnItemClickListener? = null

    inner class MyImageHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivImage: ImageView = itemView.ivReddit

        init {
            ivImage.setOnClickListener {
                onItemClickListener?.onItemClicked(adapterPosition, childrenList!![adapterPosition])
            }
        }

    }

}
