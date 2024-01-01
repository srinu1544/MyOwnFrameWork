package com.example.myownframework.kotlin_Android.retrofit.api


import com.example.myownframework.KOTLIN_ANDROID.retrofit.model.Users
import retrofit2.http.GET

interface ApiInterface {


    @GET("/users")
    suspend fun getAllUsers() : Users
}