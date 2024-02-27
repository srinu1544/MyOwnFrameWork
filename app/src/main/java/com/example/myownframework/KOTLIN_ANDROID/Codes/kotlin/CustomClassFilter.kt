package com.example.myownframework.Kotlin_Android.Codes.kotlin

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {

    val people = listOf(Person("Alice", 25), Person("Bob", 30), Person("Carol", 35))

    // Filter the list to only include people who are over 30 years old
    val over30 = people.filter { it.age > 30 }

    // Print the names of the people who are over 30 years old
    for (person in over30) {
        println(person.name)
    }

    sortingById()
}


fun sortingById(){
    class Person(val id: Int, val name: String)


        val people = listOf(
            Person(1, "Alice"),
            Person(3, "Bob"),
            Person(2, "Carol")
        )

        // Sort the people by id
        val sortedPeople = people.sortedBy { it.id  }

        // Print the sorted people
        sortedPeople.forEach { println(it.name) }
    }
