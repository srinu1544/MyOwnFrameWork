package com.example.myownframework.Kotlin_Android.Codes

fun main() {

    val n =  myPrint(55)
    println(n)

}

fun myPrint(n : Int) : Int {
    var result : Int = 0
    val nums = arrayOf(12, 21, 23, 24, 42, 43, 54)
    for (i in 0 until nums.size) {
        if (nums[i].equals(n)) {
            result = i
        } else {
            result = -1
        }
    }
    return result
}