package com.example.androidlab

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainText: TextView = findViewById(R.id.textView)
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)

        btn1.setOnClickListener {
            mainText.text = "20195138"
        }

        btn2.setOnClickListener {
            mainText.text = "김준호"
        }
    }
}