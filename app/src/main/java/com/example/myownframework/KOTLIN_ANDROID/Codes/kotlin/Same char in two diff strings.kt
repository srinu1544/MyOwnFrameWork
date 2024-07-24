package com.example.myownframework.Kotlin_Android.Codes.kotlin



fun main(){
    val b = chars()
    println(b)
}


fun chars() : Boolean {


    val str1 = "nagaram"
    val str2 = "angaram"


    val charCountMap1 = mutableMapOf<Char,Int>()

    for (char in str1){
        charCountMap1[char] = charCountMap1.getOrDefault(char,0)+1
    }

    val charCountMap2 = mutableMapOf<Char,Int>()

    for (char in str2){
        charCountMap2[char] = charCountMap2.getOrDefault(char,0)+1
    }

    //print(charcountmap1 == charcountmap2)
    if (charCountMap1 == charCountMap2){
        return true
    }else false

    return false
}

