package com.example.myownframework.Kotlin_Android.Differences

/*
 Primary Key :
 ------------
A Primary Key is a unique identifier for each record in a database table.

Uniqueness: Each value in a primary key column must be unique. No two rows can have the same primary key value.
Non-Nullable: Primary keys cannot be null. Every record in the table must have a valid primary key value.
Single or Composite Key: A primary key can be a single column (like userId), or it can be composed of multiple columns (composite key).
Automatic Indexing: Primary keys are automatically indexed for efficient querying

@Entity
data class User(
    @PrimaryKey val userId: Int,
    val name: String,
    val age: Int
)


 Foreign Key :
 --------------
A Foreign Key is a field (or collection of fields) in a table that establishes a link to the primary key of another table. Foreign keys enforce referential integrity by ensuring that values in the foreign key column(s) correspond to existing records in the referenced table.

Referential Integrity: A foreign key references the primary key of another table, ensuring that the linked record exists.
Nullable: Foreign keys can be null, depending on the relationship between tables.
One-to-Many or Many-to-Many Relationships: Foreign keys enable relationships lik

@Entity
data class Order(
    @PrimaryKey val orderId: Int,
    val orderDate: String,
    val userId: Int // foreign key linking to the User table
)

To enforce referential integrity with Room, you can add @ForeignKey:

@Entity(
    foreignKeys = [ForeignKey(entity = User::class,
        parentColumns = arrayOf("userId"),
        childColumns = arrayOf("userId"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class Order(
    @PrimaryKey val orderId: Int,
    val orderDate: String,
    val userId: Int // foreign key to User table
)

*/

