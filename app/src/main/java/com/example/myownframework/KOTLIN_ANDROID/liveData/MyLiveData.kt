package com.example.myownframework.kotlin_Android.liveData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyLiveData  : ViewModel() {

     private var _user = MutableLiveData<String>("srinivas")
     var user : LiveData<String> = _user


     fun setUserData(name : String){
        _user.value = name
    }












}