package com.example.recyclerviewcolorsk

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ColorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val template = "#%1\$08x"
    val tv = itemView.findViewById<TextView>(R.id.color)

    fun bindTo(color: Int) {
        tv.setBackgroundColor(color)
        tv.text = itemView.context.getString(R.string.template, color)
    }
}
