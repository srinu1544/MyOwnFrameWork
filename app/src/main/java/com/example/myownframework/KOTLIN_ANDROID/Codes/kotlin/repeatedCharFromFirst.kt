package com.example.myownframework.KOTLIN_ANDROID.Codes.kotlin

fun main() {
    val name = "srinivas"
    val map = mutableMapOf<Char, Int>()

    // Populate the map with character counts
    for (char in name) {
        map[char] = map.getOrDefault(char, 0) + 1
    }

    // Find the first repeated character
    for (char in name) {
        if (map[char]!! > 1) {
            println("First repeated character: $char")
            return
        }
    }

    println("No repeated characters")
}