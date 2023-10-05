package com.example.myownframework.Dagger2

import dagger.Component

@Component
interface CarComponent {

    fun getCar() : Car
}