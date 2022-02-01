package com.example.recyclerviewcolorsk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    // TODO: реализовать генерацию случайного списка строк
    // и кнопку для перегенрации и отображения нового списка


    val list = arrayListOf<String>("Mars", "Venus", "Earth")
    val listNew = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {

        listNew.randomGenerateSymbolsList()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lv = findViewById<ListView>(R.id.list)
        val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listNew)
        lv.adapter = adapter
    }

    fun ArrayList<String>.randomGenerateSymbolsList(): ArrayList<String> {
        for (i in 0..5) {
            this.add(List(10){
                (('a'..'z') + ('A'..'Z') + ('0'..'9')).random()
            }.joinToString(separator = ""))
        }

        return this
    }


    fun onRandom(view: android.view.View) {
        listNew.clear()
        listNew.randomGenerateSymbolsList()

        val lv = findViewById<ListView>(R.id.list)
        val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listNew)
        lv.adapter = adapter

        adapter.notifyDataSetChanged()
    }
}