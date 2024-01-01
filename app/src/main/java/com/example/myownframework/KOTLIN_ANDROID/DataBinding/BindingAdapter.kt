package com.example.myownframework.Kotlin_Android.DataBinding

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter


/*

@BindingAdapter("app:textwatcher")
fun watcher(view : EditText,textWatcher: TextWatcher) {

    view.addTextChangedListener(textWatcher)

}*/

@BindingAdapter(value = ["app:imageUrl","app:context"], requireAll = true)
fun image(view : ImageView, url :String?,context : Context) {



}
