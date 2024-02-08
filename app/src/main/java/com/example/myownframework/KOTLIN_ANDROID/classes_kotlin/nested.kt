package com.example.myownframework.Kotlin_Android.classes_kotlin;

/*

In Kotlin, a nested class is a class that is defined inside another class. It can be either a static nested
class or a member inner class. A static nested class is not bound to an instance of the outer class,
whereas a member inner class is bound to an instance of the outer class.

Nested classes are useful when you want to group classes that are closely related together. For example,
you might have a class called OuterClass that represents a car. You could then have a nested class called
Engine that represents the engine of the car.

To define a nested class in Kotlin, you use the class keyword inside the body of the outer class.
For example, to define a nested class called NestedClass inside the OuterClass, you would write
the following code:

class OuterClass {
    class NestedClass {
        // Nested class code goes here
    }
}

You can then access the nested class from the outer class using the . operator. For example, to create an
instance of the NestedClass class, you would write the following code:
val nestedClass = OuterClass.NestedClass()

Nested classes can also access the members of the outer class. For example, the NestedClass class could
access the engine property of the OuterClass class using the following code:
val engine = outerClass.engine

Nested classes are a powerful tool that can help you to organize your code.
They are especially useful when you want to group classes that are closely related together.

*/


 class Box(val length : Int,val width:Int,val height  : Int) {

     inner class Content(val content : String) {


       fun printBoxInfo(){
           println("$length , $width , $height")
       }

        fun printContent(){
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