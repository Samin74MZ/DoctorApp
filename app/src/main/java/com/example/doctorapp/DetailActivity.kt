package com.example.doctorapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.doctorapp.databinding.DetailactivityBinding

const val DOCTOR="doctor"
class DetailActivity : AppCompatActivity() {
   val mainViewModel:MainViewModel by viewModels()
    lateinit var binding:DetailactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DetailactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val setDoctor=intent.getParcelableExtra<Doctor>(DOCTOR)
        for (doctor in MainViewModel().listOfDoctors){
            if (doctor==setDoctor){
//                val actionBar=supportActionBar
//                actionBar?.title=doctor.name
                this.title = doctor.name
//                binding.textView.text=doctor.name
//                binding.textView1.text=doctor.location
            }
        }
//        name=intent.getStringExtra("name").toString()
//        id=intent.getIntExtra("id",0)
//        phone=intent.getStringExtra("PhoneNumber").toString()
//        location=intent.getStringExtra("Location").toString()

    }

}