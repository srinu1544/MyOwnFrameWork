package com.example.myownframework.Kotlin_Android.Room
/*
differences between Update and Upsert in room database


update :
---------
-> Update will not insert an item if it doesn't exist. It will only update it if it already exists.
-> Update activity updates existing data

An update operation modifies existing records in the database.
When you perform an update, you specify the conditions that the existing records must meet to be updated, and you provide the new values for the fields you want to change.
If the specified conditions match one or more records in the database, those records will be updated with the new values.
If no records match the specified conditions, the update operation will have no effect.

upsert :
---------
-> Upsert activity updates existing data and inserts new data
-> Upsert is a combination of "update" and "insert". It stands for "update or insert".
-> The purpose of an upsert operation is to either update an existing record if it exists,
 or insert a new record if it doesn't exist.

In other words, if a record with the specified conditions already exists in the database,
it will be updated with the new values. If no such record exists, a new record will be
inserted with the provided values.

The decision of whether to update or insert is typically based on a primary key or unique
constraint. If the specified conditions for upsert match an existing record based on the
primary key or unique constraint, it will be updated; otherwise, a new record will be inserted.

Upsert is useful when you want to ensure that a record exists in the database and is up to date,
without needing to first check if it exists and then decide whether to insert or update.


*/
