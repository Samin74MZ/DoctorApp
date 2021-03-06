package com.example.doctorapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Doctor(var name:String,var id:Number,var phone:String,var location:String):Parcelable{}