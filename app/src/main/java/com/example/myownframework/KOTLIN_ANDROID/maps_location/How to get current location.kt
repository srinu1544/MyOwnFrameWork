package com.example.myownframework.Kotlin_Android.Maps_Location

/* in dependency integrate the location dependency

-> add this in dependency
implementation ("com.google.android.gms:play-services-location:21.2.0")

-> add in manifest file
 <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

-> if you want to take background location
add below
 <uses-permission android:name="android.permission.ACCESS_BACKGROUND_LOCATION" />
 if the app targets Android 10 (API level 29) or higher



Kotlin
// In your Activity class
import android.Manifest
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat

private lateinit var fusedLocationClient: FusedLocationProviderClient

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // ...

    fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

    // Check for location permission
    if (checkLocationPermission()) {
        // Permission granted, get last location
        fusedLocationClient.lastLocation.addOnSuccessListener { location ->
            if (location != null) {
                // Use location data (latitude, longitude)
                val latitude = location.latitude
                val longitude = location.longitude
                // ...
            } else {
                // No last location available
            }
        }
    } else {
        // Request permission if not granted
        requestLocationPermission()
    }
}

private fun checkLocationPermission(): Boolean {
    val fineLocationPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
    return fineLocationPermission == PackageManager.PERMISSION_GRANTED
}

private fun requestLocationPermission() {
    ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), REQUEST_LOCATION_CODE)
}






*/