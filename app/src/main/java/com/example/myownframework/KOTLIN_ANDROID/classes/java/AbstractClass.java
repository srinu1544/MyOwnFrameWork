package com.example.myownframework.Kotlin_Android.Classes.java;


/* Abstract class :
  -----------------
  -> Abstract classes 0 to 100 per of abstraction
  -> An abstract class in Java is a class that is declared with the abstract keyword
  -> partial implementation class
  -> It may or may not include abstract methods
  -> Abstract classes cannot be instantiated, but they can be subclassed
  -> if class contain at least one abstract method then that class must be declare with abstract key
  -> abstract class contains both concrete and abstract methods.


  */

public abstract class AbstractClass {

    int salary = 0;

    public static void main(String[] args) {

    }

    abstract void mymethod();

}


abstract class Shape {


    // Abstract method
    abstract void draw();

    // Concrete method
    double area() {
        return 0.0;
    }
}


class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle...");
    }
}
