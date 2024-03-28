package com.example.myownframework.Kotlin_Android.Constructors.java;

public class ConstructorEx {


}


// Default constructor
class Person1 {
    public Person1 () {
    }
}

// Parameterized constructor
class Person2 {
    public Person2 (String name, int age) {

    }
}

// Copy constructor
class Person3 {
    public Person3 (Person2 other) {

    }
}

// Private constructor
class Person4 {
    private Person4 () {
    }

    public static  Person4 getInstance() {
        return new Person4 ();
    }
}