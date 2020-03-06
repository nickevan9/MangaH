package com.phone.extension.mangah.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.phone.extension.mangah.R
import com.phone.extension.mangah.data.entities.MangaItem
import kotlin.properties.Delegates

class MangaVerticalAdapter(private val context: Context) :
    RecyclerView.Adapter<MangaVerticalAdapter.ViewHolder>() {

    private val mInflater: LayoutInflater = LayoutInflater.from(context)

    private var mData: List<MangaItem> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = mInflater.inflate(R.layout.item_manga_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = mData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(mData[position])
    }

    fun updateData(newData: List<MangaItem>) {
        mData = newData
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val mImgManga: ImageView = itemView.findViewById(R.id.img_manga)
        private val mTvTimeUpdate: TextView = itemView.findViewById(R.id.tv_time_update)
        private val mTvEpisode: TextView = itemView.findViewById(R.id.tv_episode)
        private val mTvName: TextView = itemView.findViewById(R.id.tv_name_manga)
        private val mTvDescription: TextView = itemView.findViewById(R.id.tv_description)
        private val mTvFollow: TextView = itemView.findViewById(R.id.tv_follow)
        private val mTvWatch: TextView = itemView.findViewById(R.id.tv_watch)
        private val mImgDone: ImageView = itemView.findViewById(R.id.img_done)

        fun bindView(item: MangaItem) {
            mImgManga.load(item.icon) {
                crossfade(true)
                crossfade(1000)
            }

            mTvTimeUpdate.text = item.timeUpdate.time
            mTvEpisode.text = item.episode.episode
            mTvName.text = item.name
            mTvDescription.text = item.info.description
            if (item.info.listStatus.size == 3) {
                mTvFollow.text = item.info.listStatus[2].info
                mTvWatch.text = item.info.listStatus[1].info
                if (item.info.listStatus[0].info.equals("Tình trạng: Đang Cập Nhật")) {
                    mImgDone.visibility = View.GONE
                } else {
                    mImgDone.visibility = View.VISIBLE
                }
            }
        }
    }
}