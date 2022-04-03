package com.example.recyclerviewcolorsk


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter


internal class ColorAdapter(private val inflater: LayoutInflater) :

    ListAdapter<Int, ColorViewHolder>(DIFF_CALLBACK) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        val row: View = inflater.inflate(R.layout.item, parent, false)
        return ColorViewHolder(row)
    }

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        holder.bindTo(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK: DiffUtil.ItemCallback<Int> =
            object : DiffUtil.ItemCallback<Int>() {
                override fun areItemsTheSame(oldColor: Int, newColor: Int): Boolean {
                    return oldColor == newColor
                }

                override fun areContentsTheSame(oldColor: Int, newColor: Int): Boolean {
                    return areItemsTheSame(oldColor, newColor)
                }
            }
    }
}
