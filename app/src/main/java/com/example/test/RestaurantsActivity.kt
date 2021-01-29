package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.textView
import kotlinx.android.synthetic.main.activity_restaurants.*

class RestaurantsActivity : AppCompatActivity() {
    val restaurants = arrayOf("Mi Mero Mole", "Mother's Bistro",
        "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
        "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
        "Lardo", "Portland City Grill", "Fat Head's Brewery",
        "Chipotle", "Subway")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurants)

        locationsListView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants)
        locationsListView.setOnItemClickListener{ parent, view, position, id ->
            val element = locationsListView.adapter.getItem(position)
            Toast.makeText(this, "Cicked", Toast.LENGTH_LONG).show()
        }

        val bundle :Bundle ?= intent.extras
        if (bundle!=null){
            val message = "Locations of restaurants: " + bundle.getString("location")
            textView.text = message
        }
    }
}