package com.example.recyclerviewcolorsk

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ColorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val tv = itemView.findViewById<TextView>(R.id.color)


    private val ch = ColorHelper()

    init {
        tv.setOnClickListener {
            Toast.makeText(tv.context, tv.text, Toast.LENGTH_SHORT).show()
            val c = ch.getColor()
            tv.text = itemView.context.getString(R.string.template, c)
            tv.setBackgroundColor(c)
        }

    }


    fun bindTo(color: Int) {
        tv.setBackgroundColor(color)
        tv.text = itemView.context.getString(R.string.template, color)
    }
}
