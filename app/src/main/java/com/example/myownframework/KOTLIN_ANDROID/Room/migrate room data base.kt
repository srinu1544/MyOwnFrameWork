package com.example.myownframework.Kotlin_Android.Room

/*


must watch this - https://www.youtube.com/watch?v=hrJZIF7qSSw&t=800s&ab_channel=PhilippLackner

if we have some type of database schema that changes overtime
if we have app already scheme running

They are two types of migrations
1 . automated migration
2 . manual migration

what is migration in room data base ?

Migrations allow you to update the database schema without losing existing data


Migrating a Room database version in an Android app typically involves making changes to
the database schema, such as adding, removing, or modifying tables or columns.

Room is a SQLite object mapping library provided by Android Jetpack, and it simplifies
working with databases in Android applications.

Here are the general steps to migrate a Room database version:

Update the Entity Class:
If you need to add or modify tables or columns in your database, update the
corresponding Entity classes. For example, if you want to add a new table or
column, create a new Entity class or modify the existing one accordingly.

Increment the Database Version: Open your AppDatabase class (or whatever you named
your Room database class) and increment the version number in the @Database annotation.

if we not migrate properly we can get   java.lang.IllegalStateException: Room cannot verify the data integrity. this error

For example:


@Database(entities = {User.class}, version = 2 , exportSchema = true)
public abstract class AppDatabase extends RoomDatabase {
    // ...
}

Create a Migration Class: If you're changing the schema in a way that requires migrating
data from the old version to the new version, you'll need to create a migration class.
 This class should implement the Migration interface and provide instructions for migrating data. You'll typically define this in your database class.


static final Migration MIGRATION_1_2 = new Migration(1, 2) {
    @Override
    public void migrate(SupportSQLiteDatabase database) {
        // Define the migration logic here.
        // You might need to create new tables, copy data, etc.
    }
};
Add Migration to Database Builder: When building your database instance using
Room.databaseBuilder, add the migration to the builder by calling .
addMigrations(MIGRATION_1_2) or whatever you named your migration class.


AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "app-database")
.addMigrations(MIGRATION_1_2) // Add your migration here
.build();

Handle Migration Errors: Room will attempt to perform the migration when you open the
database. If there are any issues during the migration, such as SQL errors or data
conversion problems, Room will throw a IllegalStateException. You should handle these
exceptions appropriately in your code.

Testing: Before deploying your updated app, thoroughly test the migration process to
ensure that data is preserved correctly.

Release the Updated App: Once you've tested the migration and are confident it works
as expected, release the updated app to users.

Remember to be cautious when making changes to your database schema, especially if your
app is already in production. Data migrations can be complex, and it's essential to ensure
that existing user data is not lost or corrupted during the migration process. Additionally,
consider taking regular database backups to have a fallback in case something goes wrong
during migration in a production environment.*/
