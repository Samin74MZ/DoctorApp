package com.example.doctorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.doctorapp.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {
    lateinit var binding: Activity1Binding
    private var buttonList= mutableListOf<Button>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.button6.setOnClickListener{
//            val intent = Intent(this, DetailActivity::class.java)
//            intent.putExtra("name",listOfDoctor[0].name)
//            intent.putExtra("id",listOfDoctor[0].id)
//            intent.putExtra("PhoneNumber",listOfDoctor[0].phone)
//            intent.putExtra("Location",listOfDoctor[0].location)
//            startActivity(intent)
//        }
//        binding.button5.setOnClickListener {
//            val intent = Intent(this, DetailActivity::class.java)
//            intent.putExtra("name",listOfDoctor[1].name)
//            intent.putExtra("id",listOfDoctor[1].id)
//            intent.putExtra("PhoneNumber",listOfDoctor[1].phone)
//            intent.putExtra("Location",listOfDoctor[1].location)
//            startActivity(intent)
//        }
//        binding.button7.setOnClickListener {
//            val intent = Intent(this, DetailActivity::class.java)
//            intent.putExtra("name",listOfDoctor[2].name)
//            intent.putExtra("id",listOfDoctor[2].id)
//            intent.putExtra("PhoneNumber",listOfDoctor[2].phone)
//            intent.putExtra("Location",listOfDoctor[2].location)
//            startActivity(intent)
//        }
//        binding.button8.setOnClickListener {
//            val intent = Intent(this, DetailActivity::class.java)
//            intent.putExtra("name",listOfDoctor[3].name)
//            intent.putExtra("id",listOfDoctor[3].id)
//            intent.putExtra("PhoneNumber",listOfDoctor[3].phone)
//            intent.putExtra("Location",listOfDoctor[3].location)
//            startActivity(intent)
//        }
//        binding.button10.setOnClickListener {
//            val intent = Intent(this, DetailActivity::class.java)
//            intent.putExtra("name",listOfDoctor[4].name)
//            intent.putExtra("id",listOfDoctor[4].id)
//            intent.putExtra("PhoneNumber",listOfDoctor[4].phone)
//            intent.putExtra("Location",listOfDoctor[4].location)
//            startActivity(intent)
//        }
////        buttonList.add(binding.button5)
//        buttonList.add(binding.button6)
//        buttonList.add(binding.button7)
//        for (button in buttonList){
//
//        }
        initButton()
        for (i in 0 until buttonList.size){
            buttonList[i].text=Hospital.listOfDoctors[i].name
            buttonList[i].setOnClickListener { goToDoctorPage(Hospital.listOfDoctors[i]) }
        }

    }
    private fun initButton(){
        buttonList.add(binding.button6)
        buttonList.add(binding.button5)
        buttonList.add(binding.button7)
        buttonList.add(binding.button8)
        buttonList.add(binding.button10)
    }
    private fun goToDoctorPage(doctor: Doctor){
        val intent=Intent(this,DetailActivity::class.java)
        intent.putExtra(DOCTOR,doctor)
        startActivity(intent)
    }
}