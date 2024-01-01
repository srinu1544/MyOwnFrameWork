package com.example.myownframework.Kotlin_Android.Room

/*Room is a widely used persistence library in Android that provides an abstraction layer over SQLite,
 a popular relational database engine. It is part of the Android Jetpack library, which helps developers
 build high-quality, robust Android applications more easily.

Room Database in Android offers the following key components and features:

Entity:
An entity represents a table in your SQLite database. Each entity class defines the schema for a table
and is annotated with @Entity. You can think of it as a Java/Kotlin class that maps to a database table.

DAO (Data Access Object):
DAOs are used to define the methods that access the database. You create an interface or abstract class
annotated with @Dao, and then you define the queries and operations you want to perform on the database
using annotated methods. Room generates the necessary code to execute these queries.

Database:
The database is an abstract class that extends RoomDatabase. It acts as a database holder and serves as
the main access point for the underlying SQLite database. You annotate it with @Database and specify the
list of entities it includes and the database version. Room generates a concrete implementation of this
class for you.

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





 @Upsert :





 */

