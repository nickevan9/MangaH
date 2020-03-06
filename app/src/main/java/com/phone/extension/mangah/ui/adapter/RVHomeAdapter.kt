package com.phone.extension.mangah.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.phone.extension.mangah.R
import com.phone.extension.mangah.data.entities.homePage.DataHome
import kotlin.properties.Delegates

class RVHomeAdapter(private val context: Context) :
    RecyclerView.Adapter<RVHomeAdapter.ViewHolder>() {

    private val mInflater: LayoutInflater = LayoutInflater.from(context)

    private var mData: List<DataHome> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = mInflater.inflate(R.layout.item_rv_home, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = mData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(mData[position])
    }

    fun updateData(newData: List<DataHome>) {
        mData = newData
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val mImgIcon: ImageView = itemView.findViewById(R.id.img_icon)
        private val mTvName: TextView = itemView.findViewById(R.id.tv_title)
        private val mRvHome: RecyclerView = itemView.findViewById(R.id.rv_item)

        fun bindView(item: DataHome) {
            mImgIcon.load(item.icon)
            mTvName.text = item.headerTitle
            mRvHome.setHasFixedSize(true)
            val mangaHomeAdapter = MangaHorizontalAdapter(context)

            mRvHome.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

            mRvHome.adapter = mangaHomeAdapter
            mangaHomeAdapter.updateData(item.listManga)
        }
    }

}