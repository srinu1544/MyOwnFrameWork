package com.example.myownframework.Kotlin_Android.retrofit.repository

import com.example.myownframework.Kotlin_Android.Retrofit.model.Users
import com.example.myownframework.kotlin_Android.retrofit.api.ApiInterface


class UsersRepository(private val apiInterface: ApiInterface) {

    suspend fun getAllUsers() : Users {

        return apiInterface.getAllUsers()
    }
}