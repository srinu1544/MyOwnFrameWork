package com.example.myownframework.Kotlin_Android.Clean_Architecture

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myownframework.R


/*


refer : separate app composepaging3Cache

please refer :
https://www.udemy.com/course/android-clean-architecture-mvvm-jetpack/?referralCode=42035AE05A7789FD6920
https://www.skillshare.com/en/tedx?teacherRef=362049881&via=teacher-referral&utm_campaign=teacher-referral&utm_source=ShortUrl&utm_medium=teacher-referral&t=Android-with-Kotlin-MVVM-Jetpack-Clean-Architecture-in-3-hours-E-commerce-app&sku=1469686783




clean architecture actually separate A whole app into presentation Domain And data layer.

mvvm other hands is more just a set of rules that determines how data that is coming from domain should
be displayed on the ui that means you can use clean architecture guidelines together with an architectural
design like mvvm , mvi , mvc

Clean Architecture is a software design pattern that helps developers structure code to
incorporate business logic while keeping it separate from the delivery mechanism


Clean Architecture is a framework for structuring Android Kotlin applications.
It combines the benefits of Kotlin and a clear code structure to improve development
and ensure product quality.

In Clean Architecture, a use case is a piece of business logic that represents a single task that the
 system needs to perform. The use case contains the rules and logic needed to perform the task, and
  defines the inputs and outputs needed for the operation.

The Use Case layer is one of the layers of Clean Architecture. Its purpose is to contain the business
logic of the app, making it the core of the app. Each Use Case in this layer contains only one public
 method, which will be called by other classes.

Clean Architecture can help improve maintainability, modularity, and testability, as well as reduce
development time and cost.

Here are some advantages of using Clean Architecture:
-----------------------------------------------------
Your code is even more easily testable than with plain MVVM.
Your code is further decoupled.
The package structure is even easier to navigate.
The project is even easier to maintain.
Your team can add new features even more quickly.


presentation layer (ui)
Domain layer  (business layer)
Data Layer    (repository)



*/

@Preview
@Composable
fun ImageExample(){

    Column(modifier = Modifier.fillMaxSize()) {

        Image(painter = painterResource(id = R.drawable.cleana_architecture),
            contentDescription = null,
            modifier = Modifier.background(Color.Black)
        )

        Image(painter = painterResource(id = R.drawable.layers),
            contentDescription = null,
            modifier = Modifier.background(Color.Black)


        )

        Image(painter = painterResource(id = R.drawable.about_clean_architecture),
            contentDescription = null,
            modifier = Modifier.background(Color.Black)


        )

    }



}