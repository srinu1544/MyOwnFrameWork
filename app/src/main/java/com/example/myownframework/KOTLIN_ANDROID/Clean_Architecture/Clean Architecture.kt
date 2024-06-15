package com.example.MyOwnFrameWork.Kotlin_Android.Clean_Architecture

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

disadvantages :
----------------

Clean architecture can have some disadvantages for Android apps, including:
Learning curve
It can take some time to understand how all the layers work together,
especially if you are coming from patterns like simple MVVM or MVP.

Complexity

Clean architecture's emphasis on separation of concerns and layering can
result in increased complexity, making it harder to reason about the performance
characteristics of an application.

Extra classes
Clean architecture adds a lot of extra classes, so it's not ideal for low-complexity projects.

Extra effort
Each layer requires its own interfaces, rules, and dependencies,
 which can add extra effort and time to design and implement.

Abstraction and indirection
Clean architecture can introduce abstraction and indirection which make the code more
difficult to comprehend and debug.

Use cases
Clean architecture stresses on use cases, and if the software architect
 creates use cases for each of these “read” and “write” operations,
 then the number of use cases will be really high

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