package com.example.myownframework.Kotlin_Android.Room




/*
practice example in MyProjects -> RoomDatabase
and refer of https://github.com/foxandroid/RoomDB/blob/master/app/src/main/java/com/example/roomdb/StudentDao.kt

Room is a widely used persistence library in Android that provides an abstraction layer over SQLite,
a popular relational database engine. It is part of the Android Jetpack library, which helps developers
build high-quality, robust Android applications more easily.

 Their are three major components of Room database :

 @Entity
 @Doa
 @Datbase

Entity:
--------
-> Represents a table within the database
-> Room creates a table for each class that has @Entity annotation,the fields in the class
correspond column in the table.
-> Therefore the entity classes tend to be small model classes tha don't contain any logic


DAO (Data Access Object):
-------------------------
-> DAOs are used to define the methods that can access the database.
-> This is the place where write your queries
->  You create an interface or abstract class
->  Room generates the necessary code to execute these queries.

Database:
----------
-> The Database class in Room serves as an abstract class that extends RoomDatabase.
-> It's where you define the database holder, and it serves as the main access point
 to the underlying SQLite database.
-> You typically annotate this class with @Database to specify its entities and version number.

5 major components of database class :
--------------------------------------
-> annotated with @Database
-> should be a abstract class
-> extend with room database
-> include the list of entities (called table in sqlite) associated with that database
-> it should contains an abstract method that has O arguments and returns an
 interface (which is annotated  @Doa)


Type Converters:
Sometimes, you might need to store custom data types in your database, and Room allows you to define
Type Converters using the @TypeConverter annotation. These converters help Room understand how to convert
between custom data types and SQLite-supported data types.

LiveData and RxJava Support:
Room provides built-in support for LiveData and RxJava, making it easier to observe changes in your database
and update your UI accordingly.

Migration:
When you change your database schema (e.g., add a new table or alter an existing one), Room help
you handle database migrations gracefully. You can define migration paths in your database class to ensure
data consistency during updates.

Thread Safety :
Room takes care of database operations on a background thread, allowing you to perform
database queries without blocking the main UI thread, which helps maintain a smooth user experience.

Annotation Processing:
Room uses annotation processing to generate the database, DAO, and other necessary code at compile-time,
reducing runtime overhead and ensuring type safety.

Overall, Room Database simplifies the process of working with databases in Android by providing a higher-level,
more intuitive API than traditional SQLite. It promotes best practices for database interactions and helps
developers create efficient, maintainable, and reliable Android applications with robust data storage
capabilities.


 Advantages of Room Database :
 -----------------------------
-> compile time verification each sql query and entity checked at compile time so it prevents crushing at runtime.
-> less boiler plate code
-> Easily integrated with other Architecture  components like livedata





 */

