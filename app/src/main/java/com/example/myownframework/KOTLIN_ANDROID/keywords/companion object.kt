package com.example.myownframework.Kotlin_Android.Keywords

/*
In Kotlin, you can use the companion object to define static methods and properties.
In Kotlin, the companion object is a singleton, which means that there is only one instance
of the object and all its methods and properties are static.

To define a static method in Kotlin, you use the companion object keyword, followed by the name
of the object. The companion object is declared inside the class, but it is not a member of the
class.
Here is an example of a static method in Kotlin:
class MyClass {
    companion object {
        fun myStaticMethod() {
            // This is a static method
        }
    }
}

To call a static method, you use the class name, followed by the dot operator, followed by
the name of the method. For example, to call the myStaticMethod() method, you would use the
following code:

MyClass.myStaticMethod()

You can also use the companion object to define static properties. Static properties are
properties that are shared by all instances of the class. To define a static property,
you use the companion object keyword, followed by the name of the property. The companion
object is declared inside the class, but it is not a member of the class.

Here is an example of a static property in Kotlin:

class MyClass {
    companion object {
        var myStaticProperty = 0
    }
}


To access a static property, you use the class name, followed by the dot operator,
followed by the name of the property. For example, to access the myStaticProperty
property, you would use the following code:

MyClass.myStaticProperty


Static methods and properties are useful for defining methods and properties that are
shared by all instances of a class. They can also be used to define methods and properties
that are not specific to any particular instance of a class.*/