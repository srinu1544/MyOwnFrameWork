package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun main(args: Array<String>) {

    //highestCountChar()
    //highestCountCharNum()
   higherest()
}


/* getOrDefault(chr, 0): This method retrieves the value associated with the key chr from the
   charMapCount dictionary. If the key is not found, it returns the default value, which in this
    case is 0.
    + 1: This increments the count of the character by 1.*/

fun highestCountChar() {

    val str = "hello"
    val  charCountMap =  mutableMapOf<Char,Int>()
    for (char in str) {
        charCountMap[char] = charCountMap.getOrDefault(char,0) + 1
    }

    val maxChar : Map.Entry<Char, Int>? = charCountMap.maxByOrNull { it.value }
    println("${maxChar?.key} = ${maxChar?.value}")

}


fun highestCountCharNum() {

    val arr = arrayOf(1,2,3,4,4,4,4,4,4,4,5,5,5,6,7,8)
    val  charCountMap =  mutableMapOf<Int,Int>()
    for (num in arr) {
        charCountMap[num] = charCountMap.getOrDefault(num,0) + 1
    }

    println(charCountMap)


    val maxChar : Map.Entry<Int, Int>? = charCountMap.maxByOrNull { it.value }
    println("${maxChar?.key} = ${maxChar?.value}")

}



fun higherest(){

  val nums = arrayOf<Int>(1,2,3,3,3,4,5,6,7,8,8,8,8,8,8,9)
  val charCountaMap = mutableMapOf<Int,Int>()

    for(num in nums) {
        charCountaMap[num] = charCountaMap.getOrDefault(num,0)+1
    }

    val key_pair = charCountaMap.maxByOrNull { it.value }

    println("${key_pair?.key}=${key_pair?.value}")




}



