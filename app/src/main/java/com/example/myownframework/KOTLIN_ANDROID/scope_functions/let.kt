package com.example.myownframework.Kotlin_Android.scope_functions

/*

To use avoid null pointer exception with along with safe call operator ?.
if you want to just execute lambda expression on a  nullable object


Return - lambda result
context object - it */


fun main(){
    val name : String? = "srinivas"

    val length = name?.let {
        println(it.reversed())
        it.length
    }


    println(length)
}