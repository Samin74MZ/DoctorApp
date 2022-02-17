package com.example.doctorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doctorapp.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {
    lateinit var binding: Activity1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button4.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("name","Sara")
            startActivity(intent)
        }
    }
}