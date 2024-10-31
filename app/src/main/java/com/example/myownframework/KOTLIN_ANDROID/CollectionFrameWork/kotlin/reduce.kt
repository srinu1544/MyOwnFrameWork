package com.example.myownframework.KOTLIN_ANDROID.CollectionFrameWork.kotlin

/*
reduce:
Initial value: The first element of the collection is used as the initial value for the accumulation.
Usage: Use reduce when you don’t need an explicit initial value, and the collection has at least one element.
Behavior: It processes the elements starting from the second one.*/


fun main() {

    val list = listOf(2,4)
    val result = list.reduce{acc , value -> acc + value}
    println(result)
}
