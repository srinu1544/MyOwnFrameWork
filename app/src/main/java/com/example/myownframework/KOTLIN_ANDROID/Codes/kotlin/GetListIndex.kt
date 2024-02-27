package com.example.myownframework.Kotlin_Android.Codes.kotlin

import java.util.Stack

fun main() {

 // search()

    stackExample()

}





// this method is for search in list if available it return index number otherwise it returns -1
fun search() {

    val stack : Stack<String> = Stack()

    stack.push("a")
    stack.push("b")
    stack.push("c")


    println(stack.search("d"))


}


fun stackExample(){

    val stack = Stack<String>()

    stack.add("a")
    stack.add("b")
    stack.add("c")
    stack.add("d")
    stack.add("e")


    println(stack.search("e"))
}