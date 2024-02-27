package com.example.myownframework.Kotlin_Android.Room

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.time.LocalDateTime


/* in room data base only primitive data types only can save if we want to save complex data types
like date and time we want to use Type convertor like below */


@Entity
data class User(
     @PrimaryKey val id : Int,
     val createdAt :  LocalDateTime
     )


class LocalDateTimeConvertor {

    @TypeConverter
    fun timeToString(time : LocalDateTime ) : String {
        return time.toString()
    }


    @RequiresApi(Build.VERSION_CODES.O)
    @TypeConverter
    fun stringToTime (string  : String ) : LocalDateTime {
        return LocalDateTime.parse(string)
    }
}


@Database(entities = [User::class], version = 1)

@TypeConverters(LocalDateTimeConvertor :: class)
abstract class MyDatabase : RoomDatabase() {
    //login
}
