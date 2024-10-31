package com.example.myownframework.KOTLIN_ANDROID.Codes.kotlin


fun removeStringAndFindIndex(array: Array<String>, target: String): Pair<Int, Array<String>> {
    val result = mutableListOf<String>()
    var foundIndex = -1

    for (i in array.indices) {
        if (array[i] == target) {
            // If the target string is found and it hasn't been recorded yet, save the index
            if (foundIndex == -1) {
                foundIndex = i
            }
        } else {
            // Add the string to the result if it does not match the target
            result.add(array[i])
        }
    }

    return Pair(foundIndex, result.toTypedArray())
}

// Example usage
fun main() {
    val strings = arrayOf("apple", "banana", "orange", "apple", "grape")
    val target = "banana"

    val (index, modifiedArray) = removeStringAndFindIndex(strings, target)

    println("Index of first found string: $index") // Output: 0
    println("Modified array: ${modifiedArray.joinToString(", ")}") // Output: banana, orange, grape
}

















































































