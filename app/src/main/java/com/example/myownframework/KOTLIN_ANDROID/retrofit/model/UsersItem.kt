package com.example.myownframework.KOTLIN_ANDROID.retrofit.model

import com.example.myownframework.Kotlin_Android.Retrofit.model.Address
import com.example.myownframework.Kotlin_Android.Retrofit.model.Company

data class UsersItem(
    val address: Address,
    val company: Company,
    val email: String,
    val id: Int,
    val name: String,
    val phone: String,
    val username: String,
    val website: String
)