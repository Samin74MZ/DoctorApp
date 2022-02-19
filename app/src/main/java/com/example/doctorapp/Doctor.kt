package com.example.doctorapp

import android.media.Image
import android.os.Parcelable
import android.provider.ContactsContract
import kotlinx.parcelize.Parcelize

@Parcelize
data class Doctor(var name:String,var id:Number,var phone:String,var location:String):Parcelable{}