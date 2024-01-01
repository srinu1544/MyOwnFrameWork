package com.example.myownframework.Kotlin_Android.Inheritance

/*A sealed interface is a type of interface that restricts the number of possible
implementations to a fixed set of options. It is similar to a sealed class, but
instead of classes, it is an interface that can only be implemented in its own file.

To create a sealed interface in Kotlin, you can use the sealed modifier before the
 interface keyword. Here's an example:

sealed interface Shape {
    fun draw()
}

This creates a sealed interface called Shape with a single method draw(). Note that
sealed interfaces can have abstract methods, just like regular interfaces.

The main benefit of using sealed interfaces is that they help to ensure that all possible
implementations are known and accounted for within the same code file. This can help to
prevent errors and make code more robust.

Here's an example of how to use a sealed interface:
class Circle : Shape {
    override fun draw() {
        // Draw a circle
    }
}

class Square : Shape {
    override fun draw() {
        // Draw a square
    }
}

fun main(args: Array<String>) {
    val shapes = listOf(Circle(), Square())

    for (shape in shapes) {
        shape.draw()
    }
}

In this example, we have two classes that implement the Shape interface: Circle and Square.
 We can then create a list of shapes and iterate over it, calling the draw() method on each
  shape.

Because the Shape interface is sealed, we know that all possible implementations are known
and accounted for within the same code file. This helps to prevent errors and make code more
 robust.*/