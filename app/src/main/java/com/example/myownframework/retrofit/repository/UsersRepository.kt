package com.example.myownframework.retrofit.repository

import com.example.myownframework.retrofit.api.ApiInterface
import com.example.myownframework.retrofit.model.Users

class UsersRepository(private val apiInterface: ApiInterface) {

    suspend fun getAllUsers() : Users {

        return apiInterface.getAllUsers()
    }
}