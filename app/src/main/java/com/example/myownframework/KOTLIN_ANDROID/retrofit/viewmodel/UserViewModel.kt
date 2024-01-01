package com.example.myownframework.KOTLIN_ANDROID.retrofit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myownframework.KOTLIN_ANDROID.retrofit.model.Users
import com.example.myownframework.KOTLIN_ANDROID.retrofit.repository.UsersRepository
import kotlinx.coroutines.launch

class UserViewModel(private val repository: UsersRepository) : ViewModel() {

   private val _users = MutableLiveData<Users>()
    val users : LiveData<Users> = _users

    fun getAllUsers() {

        viewModelScope.launch {
            _users.value = repository.getAllUsers()
        }

    }
}