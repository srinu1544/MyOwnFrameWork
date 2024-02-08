package com.example.myownframework.Kotlin_Android.configuration_changes

/*   /* Create three layouts
   ----------------------
    Create three layouts, each defining the navigation elements and view hierarchy for a different device
     configuration. The layout file's directory structure determines which configuration it applies to.

    Set the android:configChanges flag
    ----------------------------------
    Set this flag on your Activity in AndroidManifest.xml to prevent your Activities from being recreated. This ensures that all your views and data remain after an orientation change.

    Save and restore activity state
    --------------------------------
    You can also save and restore fragment state, retain fragments, and properly handle list state.

    Use ViewModels
    ---------------
    You can use ViewModels to store UI state and observe LiveData changes.

    A configuration change occurs when you modify component information that is subject to change control.
    When a configuration change occurs, the system recreates an Activity. It calls onDestroy() to destroy
    the existing Activity instance and then creates a new instance using onCreate(). The new Activity
     instance is initialized with the new, updated configuration.

*/

    //private val viewModel by viewModels<ContactsViewModel>()*/