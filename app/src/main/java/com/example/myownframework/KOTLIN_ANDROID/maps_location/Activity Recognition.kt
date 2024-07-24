package com.example.myownframework.Kotlin_Android.Maps_Location

/*

https://blog.mindorks.com/activity-recognition-in-android-still-walking-running-driving-and-much-more/#:~:text=All%20you%20need%20to%20do,the%20surety%20of%20the%20activity.

Nowadays, everyone is having smartphones, and we use them to do our day to day lives.
 The best part of Android applications that are present in mobile phones is that these
 applications try to know their users more and more. Today, many of the applications are
 taking locations of the users to give a location related feeds to the users. One common
 example of this can be a normal news application, where the app takes your current
 location and presents the news according to the location

 Activities detected by the Activity Recognition Client
The Activity Recognition Client determines a list of Activities that a user can perform and the API can detect. Following are the activities that can be detected by the Activity Recognition Client:

STILL: When the mobile device will be still i.e. the user is either sitting at some place or the mobile device is having no motion, then the Activity Recognition Client will detect the STILL activity.
ON_FOOT: When the mobile device is moving at a normal speed i.e. the user carrying the mobile device is either walking or running then the Activity Recognition Client will detect the ON_FOOT activity.
WALKING: This is a sub-activity of the ON_FOOT activity which is detected by the Activity Recognition Client when the user carrying the mobile device is walking.
RUNNING: This is also a sub-activity of ON_FOOT activity which is detected by the Activity Recognition Client when the user carrying the mobile device is running.
IN_VEHICLE: This activity detected when the mobile device is in the bus or car or some other kind of vehicle or the user holding the mobile device is present in the vehicle.
ON_BICYCLE: When the device is on the bicycle or the user carrying the mobile is on a bicycle then this activity will be detected.
TILTING: When the mobile device is being lifted and is having some angle with the flat surface then the Activity Recognition Client will detect this activity.
UNKNOWN: The Activity Recognition Client will show this result when the device is unable to detect any activity on the mobile device.


-> 1. Dependencies:

Add the required dependency to your app-level build.gradle file:

dependencies {
  implementation 'com.google.android.gms:play-services-location:+'
}

-> 2. Permissions:

Declare the following permissions in your AndroidManifest.xml:

XML
<uses-permission android:name="android.permission.ACTIVITY_RECOGNITION" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

-> 3. Activity Detection Service:

Create a service to handle activity recognition updates:


class ActivityDetectionService : IntentService(TAG) {

  override fun onCreate() {
    super.onCreate()
  }

  override fun onHandleIntent(intent: Intent?) {
    val result = ActivityRecognitionResult.extractResult(intent)
    val detectedActivities = result.probableActivities as ArrayList<*>

    // Process detected activities here (update UI, etc.)
    for (activity in detectedActivities) {
      val detectedActivity = activity as DetectedActivity
      val activityType = detectedActivity.type
      val confidence = detectedActivity.confidence

      // Handle specific activity types (STILL, WALKING, RUNNING, etc.)
      when (activityType) {
        DetectedActivity.STILL -> {
          // User is likely not moving
        }
        DetectedActivity.WALKING -> {
          // User is likely walking
        }
        DetectedActivity.RUNNING -> {
          // User is likely running
        }
        DetectedActivity.IN_VEHICLE -> {
          // User is likely driving
        }
      }
    }
  }

  companion object {
    private val TAG = ActivityDetectionService::class.java.simpleName
  }
}

-> 4. Requesting Activity Updates:

In your main activity or any relevant class, request activity updates:


fun requestActivityUpdates() {
  val activities = listOf(
      ActivityTransition.Builder()
          .setActivityType(DetectedActivity.STILL)
          .build(),
      ActivityTransition.Builder()
          .setActivityType(DetectedActivity.WALKING)
          .build(),
      ActivityTransition.Builder()
          .setActivityType(DetectedActivity.RUNNING)
          .build(),
      ActivityTransition.Builder()
          .setActivityType(DetectedActivity.IN_VEHICLE)
          .build()
  )

  val intent = ActivityRecognitionClient.getPendingIntent(this, activityRequestCode)
  val client = ActivityRecognitionClient.getClient(this)
  client.requestActivityUpdates(activityDetectionPendingIntent, activities)
}

-> 5. Unregistering Updates:

Don't forget to unregister for updates when your activity is destroyed:

override fun onDestroy() {
  super.onDestroy()
  val client = ActivityRecognitionClient.getClient(this)
  client.removeActivityUpdates(activityDetectionPendingIntent)
}
Use code with caution.
Explanation:

The ActivityDetectionService handles incoming activity updates and allows processing the detected activities (e.g., updating UI).
We request updates for specific activity types (STILL, WALKING, RUNNING, IN_VEHICLE) using ActivityTransition objects.
A PendingIntent is used to receive activity updates through an intent.
The ActivityRecognitionClient is used to request and remove activity updates.





     broadcastReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                if (intent.action == MainActivity.BROADCAST_DETECTED_ACTIVITY) {
                    val type = intent.getIntExtra("type", -1)
                    val confidence = intent.getIntExtra("confidence", 0)
                    handleUserActivity(type, confidence)
                }
            }
        }

        startTracking()
    }

    private fun handleUserActivity(type: Int, confidence: Int) {
        var label = getString(R.string.activity_unknown)

        when (type) {
            DetectedActivity.IN_VEHICLE -> {
                label = "You are in Vehicle"
            }
            DetectedActivity.ON_BICYCLE -> {
                label = "You are on Bicycle"
            }
            DetectedActivity.ON_FOOT -> {
                label = "You are on Foot"
            }
            DetectedActivity.RUNNING -> {
                label = "You are Running"
            }
            DetectedActivity.STILL -> {
                label = "You are Still"
            }
            DetectedActivity.TILTING -> {
                label = "Your phone is Tilted"
            }
            DetectedActivity.WALKING -> {
                label = "You are Walking"
            }
            DetectedActivity.UNKNOWN -> {
                label = "Unkown Activity"
            }
        }

       

 */