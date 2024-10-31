package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun printduplicateinString() {

    val name = "srinivas"
    val arr = name.toCharArray()

    val duplicates = mutableListOf<Char>()

    for (i in 0 until arr.size) {
        for (j in i+1 until arr.size){
            if (arr[i] == arr[j] && !duplicates.contains(arr[i])){
                duplicates.add(arr[i])
            }
        }
    }
    println(duplicates)
}
// out put [s,i]


fun printWithOutDuplicatesInString() {

    val name = "srinivas"
    val arr = name.toCharArray()
    val duplicates = mutableListOf<Char>()

    for (i in 0 until arr.size){
        for(j in i+1 until arr.size){
            if (arr[i] != arr[j] && !duplicates.contains(arr[i])){
                duplicates.add(arr[i])
            }
        }
    }

    println(duplicates)
}

// out put [s, r, i, n, v, a]


fun printduplicateinIntArray() {


    val arr = arrayOf(1,2,3,4,4,4,4,5,5,6,6,6)

    val duplicates = mutableListOf<Int>()

    for (i in 0 until arr.size) {
        for (j in i+1 until arr.size){
            if (arr[i] == arr[j] && !duplicates.contains(arr[i])){
                duplicates.add(arr[i])
            }

        }
    }
    println(duplicates)
}

//out put [4, 5, 6]


fun printWithOutDuplicatesInIntArray() {

    val arr = arrayOf(1,2,3,4,4,4,4,5,5,6,66,7)
    val duplicates = mutableListOf<Int>()

    for (i in 0 until arr.size) {
        for(j in 0 until arr.size) {
            if (arr[i] != arr[j] && !duplicates.contains(arr[i])){
                duplicates.add(arr[i])
            }
        }
    }
    println(duplicates)
}

// output [1, 2, 3, 4, 5, 6, 66]


// with set
fun printDuplicatesInString() {
    val str = "srinivas"
    val mutableSet = mutableSetOf<Char>()

    str.forEach { char ->
        if (!mutableSet.add(char)){
            println(char)
        }
    }
}

// with map
fun printDuplicatesInStrin() {
    val str = "srinivas"
    val charCount = mutableMapOf<Char, Int>()

    str.forEach { char ->
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }

    charCount.filter { it.value > 1 }
        .forEach { (char, _) ->
            println(char)
        }
}


fun main() {
    //printduplicateinString()
    //printWithOutDuplicatesInString()
    //printduplicateinIntArray()
    printWithOutDuplicatesInIntArray()
}





