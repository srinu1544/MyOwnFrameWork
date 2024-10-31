package com.example.myownframework.KOTLIN_ANDROID.Codes.kotlin

fun main(){
    reverseInt()
}

fun reverseInt() {
    val arr = arrayOf(1,2,3,4,5,6,7)
    val reverse = arrayListOf<Int>()
    for (i in arr.size-1 downTo 0){
        reverse.add(arr[i])
    }
    println(reverse)
}