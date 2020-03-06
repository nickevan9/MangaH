package com.phone.extension.mangah.ui.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.phone.extension.mangah.R
import com.phone.extension.mangah.data.entities.categoryPage.CategoryItem
import kotlin.properties.Delegates
import kotlin.random.Random

class CategoryAdapter(private val context: Context) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    private val mInflater: LayoutInflater = LayoutInflater.from(context)


    private var mData: List<CategoryItem> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = mInflater.inflate(R.layout.item_category, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = mData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(mData[position])
    }

    fun updateData(newData: List<CategoryItem>) {
        mData = newData
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val mCardView: CardView = itemView.findViewById(R.id.card_category)
        private val mTextView: TextView = itemView.findViewById(R.id.tv_name_category)

        fun bindView(item: CategoryItem) {
            val color = Color.argb(
                255,
                Random.nextInt(50, 200),
                Random.nextInt(50, 200),
                Random.nextInt(50, 200)
            )
            mCardView.setCardBackgroundColor(color)
            mTextView.text = item.name
        }
    }
}