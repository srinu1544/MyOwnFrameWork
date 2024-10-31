package com.example.myownframework.Kotlin_Android.CollectionFrameWork


/*
fold:
Initial value: Requires an explicit initial value for the accumulation.
Usage: Use fold when you need to specify an initial value for the accumulation.
Behavior: It processes all elements, starting from the first one, and combines them with the initial value.

The fold() function in Kotlin is a higher-order function that takes an initial value and a
function as arguments and returns a single value. The function is applied to the initial value
 and the first element of the collection, and the result is then applied to the second element,
 and so on. The function can be used to perform a variety of operations on a collection, such as
 calculating the sum, average, or maximum element.

 fold(initial: T, operation: (T, T) -> T): T

 Breakdown of the fold operation:
 ---------------------------------
Initially, acc = 0 (the starting value), and i = 1 (first element of the list).
acc + i = 0 + 1 = 1
In the second iteration, acc = 1 (result from the previous step), and i = 2 (second element of the list).
acc + i = 1 + 2 = 3
In the third iteration, acc = 3 (result from the previous step), and i = 5 (third element of the list).
acc + i = 3 + 5 = 8
So, after all iterations, the final sum is 8.



 */

fun main() {
    val num = listOf(1,2,5)
    val sum = num.fold(0) { acc , i -> acc+i }
    println(sum)
}