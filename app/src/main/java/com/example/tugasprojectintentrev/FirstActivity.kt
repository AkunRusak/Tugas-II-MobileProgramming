package com.example.tugasprojectintentrev

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        // Get the message from the Intent
        val message = intent.getStringExtra("message")

        // Set the message to TextView
        val textView = findViewById<TextView>(R.id.textViewMessage)
        textView.text = message
    }
}