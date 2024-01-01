package com.example.myownframework.Kotlin_Android.Differences

/*In Android, SQLite is a standalone database engine that uses SQL to perform database operations.
Room is a persistence library that sits on top of a SQLite database. Room offers a higher level
of abstraction, ease of use, and integration with other Android components.


SQLite
------
Database operations: Uses SQL
Compile time verification: No compile time verification of raw SQLite queries
Performance: Offers excellent performance

Room
-----
Database setup: Simplifies database setup, configuration, and interactions with the app
Compile time verification: SQL validation at compile time
Customizations: Offers a huge array of customizations
Room is part of Android Jetpack, a suite of libraries, tools, and guidance to help
developers write high quality apps.

sqlite vs room which is faster ? *
-----------------------------------

Room is faster than SQLite for loading large lists on an Android phone. Room is also more powerful
and improves data loading times.
Room is an API that uses different classes to interact with the SQLite database.
Room simplifies database operations by reducing boilerplate code and automatically
handling tasks like query generation and result mapping. It also offers a more intuitive
and developer-friendly API for CRUD (Create, Read, Update, Delete) operations.

Room is still SQLite, but it's enhanced to make it easier for developers to write better
and cleaner code

Room is an ORM,( Object Relational Mapping library). In other words, Room will map our
database objects to Java objects. Room provides an abstraction layer over SQLite to allow
fluent database access while harnessing the full power of SQLite.


Difference between SQLite and Room persistence library:-
-------------------------------------------------------

In case of SQLite, There is no compile time verification of raw SQLite queries.
But in Room there is SQL validation at compile time.

As your schema changes, you need to update the affected SQL queries manually.
Room solves this problem.

You need to use lots of boilerplate code to convert between SQL queries and Java
data objects. But, Room maps our database objects to Java Object without boilerplate code.

Room is built to work with LiveData and RxJava for data observation, while SQLite does not.
Room annotations and main components:

@Entity Define our database tables
@DAO Provide an API for reading and writing data
@Database Represent a database holder

*/