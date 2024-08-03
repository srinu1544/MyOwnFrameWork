package com.example.myownframework.Kotlin_Android.Codes.kotlin


// last repeated char}
fun main() {
    val result = findlastRepeated()
    println(result)
}

fun findlastRepeated() : Char? {

    val name = "srinivas"
    val mutableList = mutableMapOf<Char, Int>()

    for (char in name) {
        mutableList[char] = (mutableList[char] ?: 0) + 1
    }

    println(mutableList)

    for (i in name.length - 1 downTo 0) {
        if (mutableList[name[i]] == 2) {
            return name[i]
        }
    }

    return null
}

