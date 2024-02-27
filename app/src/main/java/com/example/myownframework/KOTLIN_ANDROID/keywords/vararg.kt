package com.example.myownframework.Kotlin_Android.Keywords

/*

 vararg :
 --------


In Kotlin, you can use the vararg keyword to declare a variable number of arguments (varargs)
in a function parameter. This allows you to pass an arbitrary number of arguments of the same
type to a function. Here's how you can use vararg in Kotlin

benefit of using vararg


*/


fun getNum(vararg nums: Int) : Int {

    var sum = 0
    for (num in nums)  sum += num
    return sum
}

fun main() {

    val array = intArrayOf(4,5)
    val sum =  getNum(2,3,5,*array)
    println(sum)
}





