package com.example.doctorapp

import androidx.lifecycle.ViewModel
import kotlin.coroutines.coroutineContext

//object Hospital {
//    var listOfDoctors=ArrayList<Doctor>()
//    var doctor1=Doctor("Helen B",11,"1233545","New York,NY")
//    var doctor2=Doctor("Sara D",22,"1233545","Iran Tehran")
//    var doctor3=Doctor("Alex B",19,"1233545","New York,NY")
//    var doctor4=Doctor("Dan A",133,"1233545","Sweden")
//    var doctor5=Doctor("Jake K",77,"1233545","london")
//
//init {
//   // fun addToListOfDoctors(){
//        listOfDoctors.add(doctor1)
//        listOfDoctors.add(doctor2)
//        listOfDoctors.add(doctor3)
//        listOfDoctors.add(doctor4)
//        listOfDoctors.add(doctor5)
//    //}
//}
//
//}
class MainViewModel:ViewModel(){

    var listOfDoctors=ArrayList<Doctor>()
    var doctor1=Doctor("Helen B",11,"1233545","New York,NY")
    var doctor2=Doctor("Sara D",22,"1233545","Iran Tehran")
    var doctor3=Doctor("Alex B",19,"1233545","New York,NY")
    var doctor4=Doctor("Dan A",133,"1233545","Sweden")
    var doctor5=Doctor("Jake K",77,"1233545","london")

    init {
        // fun addToListOfDoctors(){
        listOfDoctors.add(doctor1)
        listOfDoctors.add(doctor2)
        listOfDoctors.add(doctor3)
        listOfDoctors.add(doctor4)
        listOfDoctors.add(doctor5)
        //}
    }
    fun getDoctor1Data(doctor: Doctor){

    }
}