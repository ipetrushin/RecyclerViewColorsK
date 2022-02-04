package com.example.recyclerviewcolorsk

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.util.Log
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // TODO: реализовать генерацию случайного списка строк
    // и кнопку для перегенрации и отображения нового списка


    val list = arrayListOf<String>("Mars", "Venus", "Earth")
    val listNew = arrayListOf<String>()
    // TODO: реализовать генерацию цветов определённой палитры
    val colorsList = mutableListOf(Color.YELLOW, Color.RED, Color.GREEN, Color.MAGENTA)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listNew.randomGenerateSymbolsList()

        // пример использования ListView
        val lv = findViewById<ListView>(R.id.list)
        val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listNew)
        lv.adapter = adapter

        // пример использования RecyclerView с собственным адаптером
        val rv = findViewById<RecyclerView>(R.id.rview)
        val colorAdapter = ColorAdapter(LayoutInflater.from(this))
        // добавляем данные в список для отображения
        colorAdapter.submitList(colorsList)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = colorAdapter
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