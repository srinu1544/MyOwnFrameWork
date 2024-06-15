package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun findPairWithSum(arr: IntArray, target: Int): Pair<Int, Int>? {

    val map = HashMap<Int, Int>()

    for (num in arr) {
        val complement = target - num
        if (map.containsKey(complement)) {
            return Pair(complement, num)
        }
        map[num] = num
    }

    println(map)

    return null
}

fun main() {
    val array = intArrayOf(5, 2, 3, 9, 1, 9)
    val target = 11

    val pair = findPairWithSum(array, target)
    /*if (pair != null) {
        println("Pair found: ${pair.first}, ${pair.second}")
    } else {
        println("No pair found with sum $target")
    }*/
}