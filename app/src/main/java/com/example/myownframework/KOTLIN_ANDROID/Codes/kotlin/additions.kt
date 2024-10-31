package com.example.myownframework.KOTLIN_ANDROID.Codes.kotlin

// add all elements in list
// with different types

fun main () {
    method1()
    method2()
    method3()
}

fun method1() {
    val list = arrayOf(5,5,5)
    var result = 0
    for (num in list){
        result += num
    }
    println(result)
}

fun method2() {
    val list = arrayOf(5,5,5)
    var result = 0
    list.map { result += it  }
    println(result)
}

fun method3() {
    val list = arrayOf(5,5,5)
    val result = list.fold(0){ acc , num -> acc+num}
    println(result)
}