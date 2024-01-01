package com.example.myownframework.Kotlin_Android.Codes

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

4

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

    val arr = arrayOf(1,3,2,4,4,4,4,4,4,5,5)

    val mutableCount = mutableMapOf<Int,Int>()

    for (num in arr){
        mutableCount[num] = mutableCount.getOrDefault(num,0) + 1
    }

    println(mutableCount)

    val list = mutableCount.minByOrNull { it.value }
    println("lowest count number is ${list?.key} = ${list?.value} times ")


}



