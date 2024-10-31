package com.example.myownframework.KOTLIN_ANDROID.CollectionFrameWork.kotlin.operations

/*
filtering :
1) filter
2) filterNotNull
3) filterIndexed
4) filterIsInstance
5 ) partition
6) Test Predicates -> any , all , none
*/



data class Student(
    var name : String,
    var age : Int,
    var nationality : String,
    var city : String
)





fun main() {

    val student = listOf(
        Student("srinivas", 32, "indian" , "valluru"),
        Student("nani", 33, "indian" , "hyderabad"),
        Student("babi", 34, "UK" , "london"),
        Student("sai srinivas", 35, "america" , "texas")
    )

   // println(student.filter { it -> it.nationality.equals("indian") })
   // println(student.filter{it.age > 32})


    val cityandStates = mapOf(
        "andhra pradesh" to "amaravathi",
        "telangana" to "hyderabad",
        "karnataka" to "bengalore",
        "tamilnadu" to "chennai"
    )

    //cityandStates.filter{entry -> entry.key.equals("telangana")}.forEach{ k , v -> println("${k}, ${v}")}
    
    //student.filterIndexed{index , student -> index%2==0 && student.age> 30}.forEach{ it -> println(it)}

    //println(student.partition { student -> student.age > 34 }.first.forEach{ println(it) })
    //println(student.partition { student -> student.age > 34 }.second.forEach{ println(it) })


    println("is theri any australian student ${ student.any{ it.nationality.equals("austraila") }}")
    println("is theri any australian student ${ student.none { it.nationality.equals("austraila") }}")
    println("is theri any australian student ${ student.all{ it.age> 34 }}")
}