package com.example.practiceapp.Kotlin_Android.keywords

import java.io.File
import java.io.FileInputStream
import java.io.IOException


/*

In Kotlin, there's no checked exceptions, no exceptions have to be declared and you aren't forced
to catch any exception, though, of course, you can. Even when deriving from a Java class, you don't
have to declare exceptions that a method throws.

@Throws(SomeException::class) is just intended for Java interoperability, which allows one to write
a function with throws in Java signature, so that in Java it will be possible (and necessary) to
handle the exception.*/


@Throws(IOException::class)
fun findFile() {
    val newFile = File("test.txt")
    val stream = FileInputStream(newFile)
}


fun main(){
    findFile()
}


/*  java

The throws keyword in Java is used to declare the exceptions that can occur during
 the execution of a program. It is used in the signature of a method to indicate that
 this method might throw one of the listed type exceptions. The caller to these methods
  has to handle the exception using a try-catch block.


  public static void findFile() throws IOException {
  // code that may produce IOException
  File newFile = new File("test.txt");
  FileInputStream stream = new FileInputStream(newFile);
}





 */
