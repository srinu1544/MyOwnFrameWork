package com.example.myownframework.Kotlin_Android.toast

import android.content.Context
import android.widget.Toast


class MyToast()  {

    companion object{
        fun toast(text:String,context: Context) {

            val text = "Hello toast!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(context, text, duration) // in Activity
            toast.show()
        }

    }
}




