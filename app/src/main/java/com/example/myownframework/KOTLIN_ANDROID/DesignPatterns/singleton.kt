package com.example.myownframework.Kotlin_Android.DesignPatterns


/*
https://www.geeksforgeeks.org/singleton-class-in-kotlin/

In Android, a singleton class is a software design pattern that limits a class to one instance.
This means that the class can only be instantiated once. Any subsequent attempts to instantiate
the class will return the same instance that was created previously.

Singleton classes are used in Android applications when an item needs to be created just once and
used across the board. This is because repeatedly creating these objects uses up system resources.

by default object is thread safe

Some uses of singleton classes include:
---------------------------------------
Controlling concurrency
Creating a central point of access for an application to access its data store
Managing application-level state
Providing a global configuration for your app
Singleton classes support interface implementation and inheritance*/


/*class MySingleton {

    companion object {

        private val instance: MySingleton by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            MySingleton()
        }

        fun getInstance(): MySingleton {
            return instance
        }
    }

}

Advantages and Disadvantages of using Singleton Pattern
-------------------------------------------------------
Advantages
-----------
Reduce memory usage: By creating only one instance of a class, we can avoid allocating and
deallocating memory for multiple objects of the same type. This can improve the cache efficiency
and reduce the garbage collector overhead.

Simplified access and control: Using a Singleton pattern can simplify the access and control of
a shared resource. The only instance of the class can be accessed easily and the Singleton class
can control the instantiation of the only instance and restrict the creation of multiple instances.

Disadvantages
-------------
Reduced scalability and testability: By creating a global state, you can introduce dependencies
and coupling between different components of your application, making it harder to modify or extend them.
You can also limit the flexibility and configurability of your application, as you cannot easily replace
or mock the singleton instance for different scenarios or environments.

Increased complexity and risk: By implementing the singleton pattern, you have to deal with some
technical challenges, such as ensuring thread safety, lazy initialization, serialization, and reflection.
You also have to be careful about the design and implementation of your singleton class, as it can
become a source of bugs, memory leaks, or performance bottlenecks if not done properly.



*/


object manager{

    init {
        println("manager object is initialized")
    }
}





fun main(){
    println(manager)
    println(manager)
}








