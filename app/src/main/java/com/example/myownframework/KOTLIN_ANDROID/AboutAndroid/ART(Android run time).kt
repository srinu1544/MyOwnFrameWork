package com.example.myownframework.Kotlin_Android.AboutAndroid

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myownframework.R

/*
https://proandroiddev.com/android-runtime-how-dalvik-and-art-work-6e57cf1c50e5

Android Runtime (ART) is a runtime environment for Android apps. It translates bytecode
into native instructions that the device's runtime environment executes. ART is the default
runtime for Android 5.0 and higher.

 ART is the successor to Dalvik, which was originally used by Android. ART uses an
 ahead-of-time (AOT) compiler to pre-compile applications before they are executed.
 This allows for faster application startup times and better memory management

 ART's advanced garbage collection mechanism improves memory management, reducing the
 likelihood of memory-related issues. As ART directly executes native code, it
 significantly reduces the startup time of application

*/


@Preview
@Composable
fun AndroidART(){

    Image(painter = painterResource(id = R.drawable.art), contentDescription = null)
}