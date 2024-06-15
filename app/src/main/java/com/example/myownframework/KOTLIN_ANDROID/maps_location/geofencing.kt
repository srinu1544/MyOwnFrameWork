package com.example.myownframework.Kotlin_Android.Maps_Location

/*
Geofencing is a location-based service that can be used on Android devices.
It allows devices to monitor a circular area and send a notification when it
enters or exits that area. This can be useful for apps that want to use location as a trigger

For example, a company could send promotions to customers' smartphones when they enter a store,
mall, or neighborhood.
To enable geofencing on Android devices, you can do the following:
Go to Device Management on the MDM server
Enter the place's longitude and latitude
Choose the preferred radius of your new Geofence
Choose the name for it
For best results, the minimum radius of the geofence should be set between 100 - 150 meters.
When Wi-Fi is available location accuracy is usually between 20 - 50 meters.



GEOFENCE_TRANSITION_DWELL: Indicates that the user entered the area and spent some time there
GEOFENCE_TRANSITION_ENTER: Indicates when the user enters the monitored region
GEOFENCE_TRANSITION_EXIT: Indicates when the user exits the region

procedure :

-> 1. Dependencies:

Add the required dependencies in your build.gradle file:
implementation 'com.google.android.gms:play-services-location:19.0.1'

-> 2. Permissions:

Request necessary location permissions in your AndroidManifest.xml:

XML
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_BACKGROUND_LOCATION" />
Use code with caution.

-> 3. Geofence Object:

Create a Geofence object defining the location and transition type:


val geofenceId = "YOUR_UNIQUE_ID"
val latitude = 37.4219983
val longitude = -122.08427
val radius = 100f // in meters

val geofence = Geofence.Builder()
    .setRequestId(geofenceId)
    .setCircularRegion(latitude, longitude, radius)
    .setTransitionTypes(Geofence.GEOFENCE_TRANSITION_ENTER or Geofence.GEOFENCE_TRANSITION_EXIT)
    .setExpirationDuration(TimeUnit.HOURS.toMillis(LONG)) // Optional expiration time
    .build()

-> 4. Geofence Request:

Create a GeofencingRequest containing a list of geofences:


val geofenceList = mutableListOf(geofence)
val geofenceRequest = GeofencingRequest.Builder()
    .setInitialTrigger(GeofencingRequest.INITIAL_TRIGGER_ENTER)
    .addGeofences(geofenceList)
    .build()

-> 5. Broadcast Receiver:

Implement a BroadcastReceiver to handle geofence events:

Kotlin
class GeofenceBroadcastReceiver : BroadcastReceiver() {
  override fun onReceive(context: Context, intent: Intent) {
    val geofencingEvent = GeofencingEvent.fromIntent(intent)
    if (geofencingEvent.hasError) {
      // Handle error
    } else {
      val transitionType = geofencingEvent.geofenceTransition
      val triggeringGeofences = geofencingEvent.triggeringGeofences

      // Handle ENTER or EXIT events based on transitionType
    }
  }
}

-> 6. Adding and Removing Geofences:

Use the GeofencingClient to add or remove geofences:

Kotlin
val geofencingClient = LocationServices.getGeofencingClient(context)

fun addGeofences() {
  geofencingClient.addGeofences(geofenceRequest, geofencePendingIntent)
      .addOnSuccessListener {
        // Geofences added successfully
      }
      .addOnFailureListener {
        // Handle failure
      }
}

fun removeGeofences() {
  geofencingClient.removeGeofences(geofencePendingIntent)
      .addOnSuccessListener {
        // Geofences removed successfully
      }
      .addOnFailureListener {
        // Handle failure
      }
}
Use code with caution.


-> 7. PendingIntent:

Create a PendingIntent to deliver geofence events to your BroadcastReceiver:

Kotlin
val intent = Intent(context, GeofenceBroadcastReceiver::class.java)
val pendingIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

-> 8. Handling Events:

In the BroadcastReceiver, handle ENTER or EXIT events based on the transitionType
 and take necessary actions, like sending notifications.



*/