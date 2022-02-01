package com.example.recyclerviewcolorsk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    // TODO: реализовать генерацию случайного списка строк
    // и кнопку для перегенрации и отображения нового списка
    val list = arrayListOf<String>("Mars", "Venus", "Earth")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lv = findViewById<ListView>(R.id.list)
        val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, list)
        lv.adapter = adapter
    }
}