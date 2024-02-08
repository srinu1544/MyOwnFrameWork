package com.example.myownframework.Kotlin_Android.CameraX

/*

CameraX is a Jetpack library that helps developers make camera apps. It provides a consistent
API that works on most Android devices, including those running Android 5.0 and higher. CameraX
also provides compatibility fixes and workarounds to help ensure a consistent developer experience
across many devices.

CameraX uses a use case-based approach that is lifecycle-aware. When a user presses the capture button,
CameraX invokes takePicture(). It then reprocesses the capture session to generate an image from the
captured frame and saves it to disk in JPEG format.

Here are some steps for implementing CameraX in Java:
Add permission in Manifest
Add required dependencies
Add Camera View and Capture Button in XML
Add Camera M-permission (Realtime permission)
Set up CameraX in Activit*/