package com.example.recyclerviewcolorsk

import android.graphics.Color
import kotlin.random.Random

class ColorHelper {
    fun getColor(): Int {
        val rand = Random
        return Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256))
    }

}