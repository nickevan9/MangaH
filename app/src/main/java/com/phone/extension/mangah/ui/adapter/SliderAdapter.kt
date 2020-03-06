package com.phone.extension.mangah.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import coil.api.load
import com.phone.extension.mangah.R
import com.phone.extension.mangah.data.entities.homePage.MangaTitle
import com.smarteist.autoimageslider.SliderViewAdapter
import kotlin.properties.Delegates

class SliderAdapter(private val context: Context) : SliderViewAdapter<SliderAdapter.ViewHolder>() {

    private val mInflater: LayoutInflater = LayoutInflater.from(context)

    private var mData: List<MangaTitle> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder {
        val view = mInflater.inflate(R.layout.image_slider_layout_item, parent, false)
        return ViewHolder(view)
    }

    override fun getCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder?, position: Int) {
        viewHolder!!.bindView(mData[position])
    }

    fun updateData(newData: List<MangaTitle>) {
        mData = newData
    }

    inner class ViewHolder internal constructor(itemView: View) :
        SliderViewAdapter.ViewHolder(itemView) {
        private val mImgBackground: ImageView = itemView.findViewById(R.id.iv_auto_image_slider)
        private val mTvName: TextView = itemView.findViewById(R.id.tv_title_slide)
        private val mTvChapter: TextView = itemView.findViewById(R.id.tv_chapter)

        fun bindView(item: MangaTitle) {
            mImgBackground.load(item.icon) {
                crossfade(true)
                crossfade(1000)
            }

            mTvName.text = item.name
            mTvChapter.text = item.chapterBlue.chapter
        }
    }
}