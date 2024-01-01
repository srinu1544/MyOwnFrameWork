package com.example.myownframework.Kotlin_Android.Differences

/*
 Throw :
 -------

The throw keyword in Java is used to throw a single exception directly.
This might happen inside a procedure or in any code block.
The throw keyword may be used to throw both checked and unchecked exceptions.

When the throw keyword is used to throw an exception, the program's execution is halted and
 control is passed to the closest enclosing try-catch block that fits the kind of exception
 raised. If no such match is discovered, the application is terminated by the default exception
 handler.

The throw keyword may be used to throw exceptions when particular criteria are met,
such as when a user inputs wrong data. It may also be used to throw custom exceptions
that are unique to a particular program or application.

Using the throw keyword in a method, unchecked exceptions may be propagated up the call stack.
 When the method that throws the exception defines it using the throws keyword, checked exceptions
 may be propagated using the throw keyword.

 Example :

 fun main(args: Array<String>) {
  validate(15)
  println("code after validation check...")
}

fun validate(age: Int) {
  if (age < 18) {
    throw ArithmeticException("under age")
  } else {
    println("eligible for drive")
  }
}


Throws :
--------
In Java, the throws keyword is used to specify exceptions that may occur during program execution.
It is required to use the throws keyword to list the exceptions that may be thrown in any method
that can throw them. The throws keyword informs both the programmer and the caller of the method
that throws the exceptions about the exceptions.

Exceptions may be propagated up the call stack using the throws keyword. It is not necessary for
a method to handle an exception if it states that it will throw one. The caller of an
exception-throwing method is responsible for handling the exceptions
(or throwing them to its caller, etc.) so that the program's flow may be maintained.

The throws keyword must only be used to throw checked exceptions. Exceptions that aren't
checked don't need to be thrown or handled directly in code.


@Throws(IOException::class)
fun readFile(name: String): String {...}
will be translated to

String readFile(String name) throws IOException {...}







*/