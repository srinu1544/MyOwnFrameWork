package com.example.myownframework.Kotlin_Android.DesignPatterns


/*In Android, a singleton class is a software design pattern that limits a class to one instance.
This means that the class can only be instantiated once. Any subsequent attempts to instantiate
the class will return the same instance that was created previously.

Singleton classes are used in Android applications when an item needs to be created just once and
used across the board. This is because repeatedly creating these objects uses up system resources.

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

}*/



