package com.example.myownframework.kotlin_Android.retrofit.api


import com.example.myownframework.Kotlin_Android.Retrofit.model.Users
import retrofit2.http.GET

interface ApiInterface {


    @GET("/users")
    suspend fun getAllUsers() : Users
}