package com.example.myownframework.databinding

import android.content.Context
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import java.security.interfaces.RSAPrivateKey

/*
@BindingAdapter("app:textwatcher")
fun watcher(view : EditText,textWatcher: TextWatcher) {

    view.addTextChangedListener(textWatcher)

}*/

@BindingAdapter(value = ["app:imageUrl","app:context"], requireAll = true)
fun image(view : ImageView, url :String?,context : Context) {



}
