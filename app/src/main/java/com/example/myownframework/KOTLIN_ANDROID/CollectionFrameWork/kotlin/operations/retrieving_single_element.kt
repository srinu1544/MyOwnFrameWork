package com.example.myownframework.KOTLIN_ANDROID.CollectionFrameWork.kotlin.operations


/*
1) elementAt
2) elementAtOrNull
3) elementAtOrElse
 */

fun main() {
    val list = listOf("na","nani", "babi", "srinivas", "sai","roja", "sai roja","ramoju","amulya")
   // println(list.elementAt(3))
   // println(list.elementAtOrNull(10))
   // println(list.elementAtOrElse(10){"No element at given index"})

    //println(list.first())
    //println(list.last())

    //println(list.first{it.startsWith("s", ignoreCase = true)})
    //println(list.last{it.startsWith("s", ignoreCase = true)})

    //println(list.find { it.equals("babi")})
    //println(list.find { it.length > 5})


    //println(list.random())
    //println(list.contains("nani"))
    //println(list.isEmpty())
    //println(list.isNotEmpty())
    //println(list.isNullOrEmpty())

   // diamentions()

    println(list.sorted())
    println(list.sortedDescending())



}

data class Reactangle(val width : Int , val height : Int) {
    val area = width * height
}

    fun diamentions() {
        val reactanges = listOf(
            Reactangle(5, 7),
            Reactangle(10, 15),
            Reactangle(2, 3),
            Reactangle(9, 10),
            Reactangle(10, 10),
            Reactangle(20, 20)
        )

        //for (react in reactanges) {
        //    println("The area of reactangle is ${react.area}")
        //  }

        val areaGreaterThan50 = reactanges.firstNotNullOfOrNull { it.area.takeIf{ it >= 40} }
        println("The area greater than 50 is $areaGreaterThan50")
    }




