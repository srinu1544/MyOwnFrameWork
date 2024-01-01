package com.example.myownframework.Kotlin_Android.Others

/*Handling screen rotation in Android programmatically can be done in several ways,
depending on your specific requirements and the complexity of your app. Here are some
common approaches:

Using Configuration Changes: By default, Android handles screen rotation by destroying
and recreating the activity. You can override this behavior by specifying in your
AndroidManifest.xml that you want to handle certain configuration changes yourself.


For example:
xml
<activity
    android:name=".YourActivity"
    android:configChanges="orientation|screenSize">
</activity>

Then, you can override the onConfigurationChanged method in your activity to handle the
configuration changes as you see fit:


@Override
public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    // Handle screen rotation here
}
Using ViewModel: You can use Android's ViewModel to store and manage your UI-related data.
This allows your data to survive configuration changes like screen rotation. When the
activity is recreated, it can retrieve the ViewModel and continue where it left off.

SavedInstanceState:
You can save and restore your activity's state using the onSaveInstanceState and
onRestoreInstanceState methods. This is useful for saving temporary data or UI
state that needs to persist across configuration changes.

@Override
protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    // Save your data here
}

@Override
protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    // Restore your data here
}

Fragments:
Split your UI into fragments and use a FragmentTransaction to add, replace, or remove
fragments as needed. Fragments can retain their state across configuration changes, making
it easier to manage complex UIs.

Data Binding:
Android's Data Binding library allows you to bind UI components to data sources, making
it easier to update UI elements when data changes. Data Binding can help simplify the
handling of screen rotation.

ViewModel with LiveData:
Combine ViewModel with LiveData to create a reactive UI.
LiveData can automatically notify your UI when data changes, making it a good choice for
handling UI updates during screen rotation.

Using Preferences or a Database:
For persisting data that needs to survive app restarts and configuration changes, you can
use SharedPreferences for simple key-value pairs or a local database (e.g., SQLite or Room)
for more complex data.

The approach you choose depends on your app's specific requirements and design. Simple
apps may rely on the default configuration change handling, while more complex apps may
require a combination of these methods to ensure a smooth user experience during screen
rotation.

 */