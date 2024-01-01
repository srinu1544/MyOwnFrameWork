package com.example.myownframework.Kotlin_Android.Polymorphism

/*The word polymorphism means having many forms. In simple words, we can define polymorphism
as the ability of a message to be displayed in more than one form.

 Types of polymorphism
Polymorphism is mainly divided into two types:

Compile-time Polymorphism
Runtime Polymorphism
Examples
Example 1: Compile-time Polymorphism

Let’s start with compile-time polymorphism. In compile-time polymorphism, the name functions,
that is, the signature remains the same but parameters or return type is different. At compile
time, the compiler then resolves which functions we are trying to call based on the type of
parameters and more. Check out this example:


fun main (args: Array<String>) {
  println(doubleof(4))
  println(doubleof(4.3))
  println(doubleof(4.323))
}

fun doubleof(a: Int):Int {
  return 2*a
}

fun doubleOf(a:Float):Float {
  return 2*a
}

fun doubleof(a:Double):Double {
  return 2.00*a
}
Output:

8
8.6
8.646
Example 2: Runtime Polymorphism

Now, let’s talk about run-time polymorphism. In run-time polymorphism, the compiler
resolves a call to overridden/overloaded methods at runtime. We can achieve run-time
polymorphism using method overriding. Let’s try an example where we extend a superclass
and override one of its member methods:


fun main(args: Array<string>){
  var a = Sup()
  a.method1()
  a.method2()

  var b = Sum()
  b.method1()
  b.method2()
}

open class Sup{
   open fun method1(){
       println("printing method 1 from inside Sup")
   }
   fun method2(){
       println("printing method 2 from inside Sup")
   }
}

class Sum:Sup(){
   override fun method1(){
       println("printing method 1 from inside Sum")
   }
}
Output:

printing method 1 from inside Sup
printing method 2 from inside Sup
printing method 1 from inside Sum
printing method 2 from inside Sup
Here, the compiler resolves, at run-time, which method to execute.


Whether you're preparing for your first job interview or aiming to upskill in this ever-evolving
tech landscape, GeeksforGeeks Courses are your key to success. We provide top-quality content at
affordable prices, all geared towards accelerating your growth in a time-bound manner. Join the
millions we've already empowered, and we're here to do the same for you. Don't miss out - check
it out now!


 */