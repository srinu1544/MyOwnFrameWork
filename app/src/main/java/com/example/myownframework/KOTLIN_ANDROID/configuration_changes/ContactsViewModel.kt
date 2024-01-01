package com.example.myownframework.Kotlin_Android.configuration_changes

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ContactsViewModel(helloword : String) : ViewModel() {


    init {
       Log.d("ContactsViewModel",helloword)
    }


    var backgroundcolor by mutableStateOf(Color.White)
        private set

    fun changeBackgroundColor(){

        backgroundcolor = Color.Red

    }
}