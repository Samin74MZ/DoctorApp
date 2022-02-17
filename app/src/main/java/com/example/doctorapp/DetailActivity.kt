package com.example.doctorapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.doctorapp.databinding.DetailactivityBinding


class DetailActivity : AppCompatActivity() {
    var name=""
    var id=0
    var phone=""
    var location=""
    lateinit var binding:DetailactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DetailactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        name=intent.getStringExtra("name").toString()
        id=intent.getIntExtra("id",0)
        phone=intent.getStringExtra("PhoneNumber").toString()
        location=intent.getStringExtra("Location").toString()
        binding.textView.text=name
        binding.textView1.text=location
    }

}