package com.example.myownframework.Kotlin_Android.Methods_Functions.kotlin

/*Kotlin allows you to provide custom implementations for the predefined set of operators on types. These operators have predefined
symbolic representation (like + or *) and precedence. To implement an operator, provide a member function or an extension function
with a specific name for the corresponding type. This type becomes the left-hand side type for binary operations and the argument
type for the unary ones */

operator fun String.plus(other:String) : Int {
    return this.compareTo(other)
}




fun main() {

    val firstname = "sai"
    val secondname = "srinivas"
    println(firstname + secondname)


}

