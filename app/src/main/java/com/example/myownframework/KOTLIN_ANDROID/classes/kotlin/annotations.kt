package com.example.myownframework.Kotlin_Android.Classes.kotlin

/*
https://www.youtube.com/watch?v=qdnhQzVGywQ&ab_channel=PhilippLackner */

data class  User(
    val name : String,
   @AllowedRegex("\\d{4}-\\d{2}-\\d{2}") val birthDate : String
)

@Target(AnnotationTarget.FIELD)
@Retention
annotation class AllowedRegex(val regex : String )