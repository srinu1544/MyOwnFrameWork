package com.example.myownframework.Kotlin_Android.collections


/*The fold() function in Kotlin is a higher-order function that takes an initial value and a
function as arguments and returns a single value. The function is applied to the initial value
 and the first element of the collection, and the result is then applied to the second element,
 and so on. The function can be used to perform a variety of operations on a collection, such as
 calculating the sum, average, or maximum element.

 fold(initial: T, operation: (T, T) -> T): T

 */

fun main(){

    val num = listOf(1,2,5)
    val sum = num.fold(0) { acc , i -> acc+i }
    println(sum)
}