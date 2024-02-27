package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun main() {
    println(removeWhiteSpaces("sri niv  as"))
}

fun removeWhiteSpaces(input: String): String? {
    val output = StringBuilder()
    val charArray = input.toCharArray()
    println("length" + charArray.size)
    for (c in charArray) {
        if (!Character.isWhitespace(c)) output.append(c)
    }
    return output.toString()
}