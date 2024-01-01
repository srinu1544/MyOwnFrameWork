package com.example.myownframework.Kotlin_Android.Others


/*
In Kotlin, you can define constants using the val keyword, and these constants can be
accessed from Java code just like any other class member. Here's how you can call a
constant object defined in Kotlin from Java:

Define a constant object in Kotlin:

object Constants {
    val MY_CONSTANT = "This is a constant"
}

In this example, we've defined an object called Constants with a constant property
MY_CONSTANT.

Call the constant from Java:
In your Java code, you can access this constant as follows:


public class JavaClass {
    public static void main(String[] args) {
        String constantValue = Constants.MY_CONSTANT;
        System.out.println("Constant Value: " + constantValue);
    }
}
Just import the Constants class from your Kotlin code into your Java code, and you can
access the constant like any other static field.

Make sure you have the Kotlin runtime and standard library included in your project
dependencies when working with Kotlin code in a Java project.
*/

