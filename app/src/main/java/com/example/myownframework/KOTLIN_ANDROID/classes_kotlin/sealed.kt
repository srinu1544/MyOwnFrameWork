package com.example.myownframework.Kotlin_Android.classes_kotlin;

/*
Sealed classes and interfaces

Sealed classes are a feature of Kotlin that allow you to define a restricted class hierarchy.
This means that a class can only be subclassed within the same file where it's declared.
Subclasses must be declared within the same file as the sealed class, and they cannot be
inherited from by any other classes.

Sealed classes are often used to represent a closed set of classes, such as when defining the different
states of a state machine. For example, you could define a sealed class called State with subclasses
Running, Paused, and Stopped. These subclasses would be able to be used to represent the different
states of a machine, and they could not be inherited from by any other classes.

Sealed classes can also be used to implement the Strategy pattern. The Strategy pattern is a design pattern
that allows you to choose different algorithms to perform a task. For example, you could define a sealed
class called Strategy with subclasses Add, Subtract, and Multiply. These subclasses would be able to be
used to perform addition, subtraction, and multiplication operations, respectively.

Sealed classes are a powerful feature of Kotlin that can be used to improve the readability and
maintainability of your code

Class -> sealed class -> enum class




why we use sealed class :

 -> In enum class constant values so we cannot change dynamically so overcome this in sealed class



 summery

 -> The subclass of sealed class must be declared in the same file in which sealed class itself is declared
 -> the sub can be data class , regular class, object class ,
  or even another sealed class or even sealed interface
  -> sealed class ensures type  safety by restricting the set of types at compile time only
  -> A sealed class implicitly an abstract class so we can not instantiated
  -> by default , the constructor of sealed class is private we cannot make it non private


 */


sealed class Shape {

    class Circle(val radius : Float) : Shape()

    class Rectangle(val length :Int , val breath : Int) : Shape()

    class Square(val side : Int) : Shape()

    object noShape : Shape()


}



fun checkShape(shape: Shape) {

    when(shape){

        is Shape.Circle ->  println( 3.14 * shape.radius * shape.radius)
        is Shape.noShape -> println("no shape")
        is Shape.Rectangle -> println(shape.length * shape.breath)
        is Shape.Square -> println(shape.side * shape.side)
    }

}


fun main(){

    var circle =
        Shape.Circle(2.0f)
    var rect =
        Shape.Rectangle(
            5,
            10
        )
    var square =
        Shape.Square(4)

    var noShape =
        Shape.noShape
    checkShape(noShape)
}


/*link https://kotlinlang.org/docs/sealed-classes.html*/




