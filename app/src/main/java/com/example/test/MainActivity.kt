package com.example.test

import android.content.Intent
import android.content.res.AssetManager
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.typeface = Typeface.createFromAsset(assets, "fonts/ostrich-regular.ttf")

        button.setOnClickListener {
            val location = locationEditText.text.toString()
            startActivity(Intent(this, RestaurantsActivity::class.java).putExtra("location", location)) }
    }
}