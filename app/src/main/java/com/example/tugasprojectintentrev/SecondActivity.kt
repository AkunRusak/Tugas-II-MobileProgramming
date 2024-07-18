package com.example.tugasprojectintentrev

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Get the biodata from the Intent
        val nama = intent.getStringExtra("nama")
        val nim = intent.getStringExtra("nim")
        val kelas = intent.getStringExtra("kelas")
        val prodi = intent.getStringExtra("prodi")
        val imageUrl = intent.getStringExtra("image_url")

        // Set the biodata to TextViews
        val textViewNama = findViewById<TextView>(R.id.textViewNama)
        val textViewNIM = findViewById<TextView>(R.id.textViewNIM)
        val textViewKelas = findViewById<TextView>(R.id.textViewKelas)
        val textViewProdi = findViewById<TextView>(R.id.textViewProdi)
        val imageViewProfile = findViewById<ImageView>(R.id.imageViewProfile)

        textViewNama.text = "Nama: $nama"
        textViewNIM.text = "NIM: $nim"
        textViewKelas.text = "Kelas: $kelas"
        textViewProdi.text = "Prodi: $prodi"

        // Load the profile image using Glide
        Glide.with(this)
            .load(imageUrl)
            .placeholder(R.drawable.cat) // Optional placeholder
            .into(imageViewProfile)
    }
}