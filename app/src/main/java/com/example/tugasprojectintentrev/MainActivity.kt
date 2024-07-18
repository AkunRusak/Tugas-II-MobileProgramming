package com.example.tugasprojectintentrev

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button to open FirstActivity
        val buttonFirst = findViewById<Button>(R.id.buttonFirst)
        buttonFirst.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            intent.putExtra("message", "時間は待ってくれない")
            startActivity(intent)
        }

        // Button to open SecondActivity
        val buttonSecond = findViewById<Button>(R.id.buttonSecond)
        buttonSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.action = Intent.ACTION_SEND
            intent.putExtra("nama", "Dwi Prasetyo")
            intent.putExtra("nim", "202111002")
            intent.putExtra("kelas", "TI21K1")
            intent.putExtra("prodi", "Teknik Informatika")
            intent.putExtra("image_url", "https://id.pinterest.com/pin/492649952495039/") // URL for the profile image
            startActivity(intent)
        }

        // Button to open GitHub Activity
        val buttonGitHub = findViewById<Button>(R.id.buttonGitHub)
        buttonGitHub.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AkunRusak"))
            startActivity(intent)
            // finish()
        })
    }
}