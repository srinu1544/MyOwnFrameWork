package com.example.myownframework.Kotlin_Android.Retrofit.model

import com.example.myownframework.KOTLIN_ANDROID.retrofit.model.Geo

data class Address(
    val city: String,
    val geo: Geo,
    val street: String,
    val suite: String,
    val zipcode: String
)