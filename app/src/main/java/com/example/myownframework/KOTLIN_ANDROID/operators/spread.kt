package com.example.myownframework.Kotlin_Android.Operators

/* spread operator :
--------------------

The spread operator in Kotlin is the * symbol, which can be used to unpack an array
into a list of values.
This can be useful when you want to pass an array as a vararg parameter.*/


fun getNum(vararg nums: Int) : Int {

    var sum = 0
    for (num in nums)  sum += num
    return sum
}

fun main(){

    val array = intArrayOf(4,5)
    val sum =  getNum(2,3,5, *array)
    println(sum)
}