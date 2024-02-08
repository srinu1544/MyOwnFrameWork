package com.example.myownframework.Kotlin_Android.ProductFlavors


/*

Product flavors are a feature in the Android Gradle Plugin that allow developers to
create different versions of an app using a single codebase.

Product flavors are similar to build types, but they allow developers
to generate different versions of an application from a shared codebase


we can generate product flavors :

way 1 :
Build -> Edit Flavors
and add flavor dimensions
and add product flavors
and give all the details

way 2 :

add this code in app.gradle in

android {

  flavorDimensions 'type'
    productFlavors {
        user {
            dimension 'type'
            applicationIdSuffix '.user'
        }
        admin {
            dimension 'type'
            applicationIdSuffix '.admin'
        }
    }

}


*/