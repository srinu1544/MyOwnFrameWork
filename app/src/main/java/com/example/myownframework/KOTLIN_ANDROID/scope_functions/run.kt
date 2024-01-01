package com.example.myownframework.Kotlin_Android.scope_functions


/*
combination of with , let
Return - lambda result
context object - this

 if you want to operate on an nullable object execute lambda expression and avaoid null point exception

 */


class Person4 {
    var name = "srinivas"
    var age = 32
}


fun main(){

    val persion4 : Person4? = null

   val after5years = persion4?.run {
        println(name)
        println(age)
        age + 5
    }

    println(after5years)

}