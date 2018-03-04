package com.example.kotlin.helloworld

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to button
        val btn_click_me =findViewById<Button>(R.id.button)
        // set on-click listener
        btn_click_me.setOnClickListener {
            val randomIntent = Intent(this, SecondActivity::class.java)
            startActivity(randomIntent)
        }
    }
}
