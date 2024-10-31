package com.example.myownframework.KOTLIN_ANDROID.CollectionFrameWork.kotlin.operations


// Grouping

/*
1) groupBy ->  transformations
2) groupingBy ->  eachCount , eachCountTo , fold , Reduce , aggrigate(sum , average ,min , max , count)

*/

fun main() {
    val person = listOf<Person>(
        Person("nani", "ramoju", "indian", 16),
        Person("babi", "R", "indian", 17),
        Person("srinivas", "Rma", "uk", 18),
        Person("nvasu", "Ramoj", "america", 19)
    )
    //person.groupBy { it.nationality }.forEach{ it -> println("${it.key} = ${it.value}")}
    //val age = person.groupBy { it.age > 18 }
    //println(age)

    val gropbyFirstName = person.groupBy { it.first_name.get(0) }
    println(gropbyFirstName)

    val group = person.groupingBy { it.nationality}.eachCount()
    println(group)

}

data class Person(
    var first_name: String,
    var last_name: String,
    var nationality: String,
    var age: Int

)