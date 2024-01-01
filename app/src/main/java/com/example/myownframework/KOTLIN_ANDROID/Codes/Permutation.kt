package com.example.myownframework.Kotlin_Android.Codes

/*

formula
P(n,r) = n!/(n-r)!

*/

fun isPermutation(str1: String, str2: String): Boolean {

    if (str1.length != str2.length) {
        return false
    }

    val charMap = mutableMapOf<Char, Int>()
    for (char in str1) {
       // charMap[char] = charMap.getOrDefault(char, 0) + 1
        charMap[char] = charMap.getOrDefault(char, 0) + 1
    }

    for (char in str2) {
        val count = charMap[char]
        if (count == null || count == 0) {
            return false
        }

        charMap[char] = count - 1
    }

    return true
}

fun main(args: Array<String>) {
    val str1 = "hello"
    val str2 = "olleh"

    println(isPermutation(str1, str2)) // true
}





/*

https://chat.openai.com/c/372896c2-4714-46f1-9595-bff6ba8a9728

charMap[char] = charMap.getOrDefault(char, 0) + 1;
Here's an explanation of each part:

charMap: This likely represents a map or dictionary data structure. In many programming languages, it's a collection that associates keys with values.

[char]: This syntax is used to access a value in the charMap using the key char.

charMap.getOrDefault(char, 0): This is a method call on the map (charMap). It tries to get the value associated with the key char. If the key is present in the map, it returns the corresponding value; otherwise, it returns a default value of 0.

+ 1: This part increments the retrieved value by 1.

charMap[char] = ...: Finally, the updated value (the original value incremented by 1) is assigned back to the map with the same key (char).

In summary, this line of code is updating a map (charMap) where keys are characters (char). It increments the value associated with a specific character by 1. If the character is not present in the map, it initializes the value to 1. This type of code is often used to count the occurrences of each character in a string or a sequence.*/