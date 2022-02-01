package com.example.recyclerviewcolorsk

import androidx.recyclerview.widget.ListAdapter

class ColorAdapter(private val inflater: LayoutInflater) :
    ListAdapter<Int, ColorViewHolder>(ColorDiffer) {

    }
