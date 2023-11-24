package com.example.myownframework.databinding

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {




    var name = MutableLiveData<String>()

    var btnText = MutableLiveData<String>()

    var editText = MutableLiveData<String>()

    var imageUrl = MutableLiveData<String>()


/*    var emailTextWatcher : TextWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            Log.d("textwatcher",p0.toString())
        }

        override fun afterTextChanged(p0: Editable?) {

        }

    }*/

    fun onClick(view : View){
        name.value = "sai srinivas"
        btnText.value = "Done"

        Log.d("edittext",editText.value.toString())

    }


}