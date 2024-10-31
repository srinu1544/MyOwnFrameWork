package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun main() {

    val nums = intArrayOf(3, 7, 11, 15)
    val target = 9

    // Call the twoSumIndex function
    val result = twoSumIndex(nums, target)

    // Print the result
    if (result.isNotEmpty()) {
        println("Indices: ${result[0]}, ${result[1]}")
    } else {
        println("No solution found.")
    }

}
// two sum with index

fun twoSumIndex( list : IntArray , target : Int) : IntArray {
    val indexToList = mutableMapOf<Int,Int>()
    for((index , num) in list.withIndex()){
        val compliment = target - num
        if(indexToList.containsKey(compliment)){
            return intArrayOf(indexToList[compliment]!!,index)
        }
        indexToList[num] = index
    }
    return intArrayOf()
}



fun twoSumNum( list : IntArray , target : Int) : IntArray {

    val indexToList = mutableMapOf<Int,Int>()

    for((index , num) in list.withIndex()){
        val compliment = target - num
        if(indexToList.containsKey(compliment)){
            return intArrayOf(compliment,num)
        }

        indexToList[num] = index

    }

    return intArrayOf()

}








