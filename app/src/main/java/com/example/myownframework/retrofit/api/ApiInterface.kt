package com.example.myownframework.retrofit.api

import com.example.myownframework.retrofit.model.Users
import retrofit2.http.GET

interface ApiInterface {


    @GET("/users")
    suspend fun getAllUsers() : Users
}