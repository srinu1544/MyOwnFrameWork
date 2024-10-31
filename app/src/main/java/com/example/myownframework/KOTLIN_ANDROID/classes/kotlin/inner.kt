package com.example.myownframework.KOTLIN_ANDROID.classes.kotlin

/*In Android, an inner class is a class defined within another class using the inner keyword in Kotlin.
An inner class has access to the members of its outer class, including private properties and functions.
This feature is useful when the inner class needs to interact closely with its enclosing (outer) class.*/


class Box(val length: Int, val width: Int, val height: Int) {
    inner class Content(val content: String) {
        fun printBoxInfo() {
            println("$length , $width , $height")
        }
        fun printContent() {
            println(content)
        }
    }
}


fun main() {

    val box = Box(10, 4, 5)
    val content = box.Content("some content")
    content.printContent()
    content.printBoxInfo()

}