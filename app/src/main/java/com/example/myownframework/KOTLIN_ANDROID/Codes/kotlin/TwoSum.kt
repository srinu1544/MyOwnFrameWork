package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun main() {

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








