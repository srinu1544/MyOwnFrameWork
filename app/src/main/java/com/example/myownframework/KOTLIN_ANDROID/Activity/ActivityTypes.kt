package com.example.myownframework.Kotlin_Android.Activity


/*
Activity : Activity is the baseline. Every activity inherits from Activity, directly or indirectly.

AppCompatActivity : If you want the backported Material Design look, use AppCompatActivity

FragmentActivity : If not, but you want nested fragments, use FragmentActivity

ActionBarActivity :


In Android development, activities are a crucial component of an app's user interface.
Each activity provides a screen with which users can interact. There are several types
 of activities in Android, each serving different purposes and providing unique functionalities.
 Here are some common types of activities and their uses:

Types of Activities

Standard Activity:
Usage: The most basic type of activity, used for any typical screen in an app.
Example: A main screen or dashboard of an app.

ListActivity:
Usage: An activity that displays a list of items using a ListView.
Example: A contacts list or a list of messages.

ExpandableListActivity:
Usage: An activity that displays an expandable list of items using an ExpandableListView.
Example: A list of categories where each category can be expanded to show items within it.
PreferenceActivity:

Usage: An activity for displaying and managing application settings.
Example: A settings screen where users can change preferences.

FragmentActivity (from androidx.fragment.app.FragmentActivity):
Usage: An activity that can contain and manage fragments.
Example: Any complex UI that requires dynamic and reusable components.

AppCompatActivity (from androidx.appcompat.app.AppCompatActivity):
Usage: A subclass of FragmentActivity that provides compatibility support for older versions
of Android and modern app features.
Example: A modern app screen with support for action bar, themes, and material design components.
ActivityGroup (deprecated):

Usage: Allows multiple activities to run within a single window. Deprecated and should be avoided.
Example: Used previously for embedding child activities within a parent activity.
TabActivity (deprecated):

Usage: Manages a set of activities in tabs. Deprecated in favor of using fragments and TabLayout.
Example: Used previously for creating tabbed navigation.
Special Use-Case Activities
FullscreenActivity:

Usage: An activity designed to fill the entire screen, often used for immersive experiences.
Example: Video players, games, and reading apps.
LoginActivity:

Usage: An activity specifically designed for user authentication.
Example: The login screen of an app.
SplashActivity:

Usage: An activity that shows a splash screen while the app is loading.
Example: An initial screen with the app logo and loading animation.
SettingsActivity:

Usage: An activity for managing user settings and preferences.
Example: A settings screen with options for changing app behavior.
Advanced Activity Types

MapActivity:
Usage: An activity that displays a map using Google Maps API.
Example: An activity that shows a location or provides navigation.

WebViewActivity:
Usage: An activity that displays web content using a WebView.
Example: An in-app browser or an activity showing online documentation.
Modern Approaches

Single Activity Architecture:
Usage: A design pattern where the app uses only one activity and relies on fragments for navigation and UI.
Example: Many modern apps use this approach for better navigation management and modularity.

Navigation Component:
Usage: A framework provided by Jetpack for managing complex navigation within an app, often with a single activity.
Example: An app with complex user flows and nested navigation graphs.

Conclusion
Understanding the different types of activities and their uses helps in designing better Android applications. While many older activity types are now deprecated in favor of fragments and newer architecture components, they each serve unique purposes in specific contexts. Modern Android development often emphasizes the use of fragments and the navigation component to build scalable and maintainable apps.




 */


