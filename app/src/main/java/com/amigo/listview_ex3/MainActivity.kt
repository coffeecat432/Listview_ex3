package com.amigo.listview_ex3

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<String>()
        list_item.add("A")
        list_item.add("B")
        list_item.add("C")

        val listview = findViewById<ListView>(R.id.mainListView)
        val listviewAdapter = ListViewAdapter(list_item)
        listview.adapter = listviewAdapter

        listview.setOnItemClickListener { adapterView, view, i, l ->

            Toast.makeText(this, list_item[i], Toast.LENGTH_SHORT).show()
        }

    }
}