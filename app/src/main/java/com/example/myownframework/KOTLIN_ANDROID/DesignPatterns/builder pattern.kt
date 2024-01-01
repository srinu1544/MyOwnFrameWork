package com.example.myownframework.Kotlin_Android.DesignPatterns

/*Pattern #3 👌 Builder

Builder pattern aims to “Separate the construction of a complex object from its representation
so that the same construction process can create different representations.” It is used to
construct a complex object step by step and the final step will return the object.

Rules for making a Builder class
The following rules are followed to make a Builder class:

A private constructor
An inner class usually called Builder
function for each field to set the field value return
function build return instance of the Main class

Following is the example of Builder class in Kotlin: */