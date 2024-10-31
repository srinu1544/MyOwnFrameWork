package com.example.myownframework.Kotlin_Android.Differences

/*In Kotlin, both val and const val are used to declare read-only variables.

 The difference between the two is that const val variables must be assigned a
  value at compile time,

  whereas val variables can be assigned a value at runtime.*/


// example for const

object  Constants {
     val name = "srinivas"
     const val name1 = "srinivas"
}
// we can show both name and name1 differences in when tools -> kotlin -> show kotlin bytecode -> decompile
// we can observe


// when val name = "srinivas" String name = Constants.INSTANCE.getName()
// when add const in before const val name = "srinivas" String name = "srinivas"

// as the value has been inlined , there will be no overhead to access
// the variable at runtime and hense it will lead to a better performance of the application
fun main(){
    println(Constants.name)

}