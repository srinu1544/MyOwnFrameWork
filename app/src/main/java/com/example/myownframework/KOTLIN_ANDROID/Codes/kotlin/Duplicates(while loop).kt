package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun main(){

    removeDuplicates()
    //printDuplicatesString()

}

// this method for print given string with out duplicates (String)
fun removeDuplicates() {

    val name = "srinivas"

    val str = name.toCharArray()

    val duplicates = mutableListOf<Char>()


    for (i in 0 until str.size) {
        var j: Int = 0
        while (j < i) {
            if (str[i] == str[j]) {
                break
            }
            j++
        }

        // If the character is not present before, add it to resulting string
        if (j == i) {
            duplicates.add(str[i])
        }
    }

    println(duplicates)
}



// this method for print given string with out duplicates (array)
fun duplicatesArray(){




    val str = arrayOf(1,2,3,4,5,6,4,5,6,7)

    val duplicates = mutableListOf<Int>()
    var index = 0

    for (i in 0 until str.size) {
        var j: Int = 0
        while (j < i) {
            if (str[i] == str[j]) {
                break
            }
            j++
        }

        // If the character is not present before, add it to resulting string
        if (j == i) {
            duplicates.add(str[i])
        }
    }

    println(duplicates)
}



fun printDuplicatesString() {

    val name = "srinivas"

    val str = name.toCharArray()

    val duplicates = mutableListOf<Char>()

    for (i in 0 until str.size) {
        var j: Int = 0
        while (j < i) {
            if (str[i] != str[j]) {
                break
            }
            j++
        }

        // If the character is not present before, add it to resulting string
        if (j == i) {
            duplicates.add(str[i])
        }
    }

    println(duplicates)
}




