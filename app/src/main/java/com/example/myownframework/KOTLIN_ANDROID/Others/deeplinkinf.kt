package com.example.myownframework.Kotlin_Android.Others

/*

Deep linking is a type of link that sends users directly to a specific location within an app.
When a user clicks on a deep link, Android opens the user's preferred app that can handle the
link. If the preferred app isn't available, it opens the only app that can handle the link.

Deep linking saves users time and energy by locating a particular page themselves. It also
enables users to jump from one app to another, but to a specific piece of content.
This creates a seamless user experience between the apps.

You can test your deep links by running the adb command against a device or an emulator.
The general syntax for testing an intent filter URI with adb is:
`$ adb shell am start. -W -a android.intent.action.VIEW. -d <URI> <PACKAGE>`

You can specify multiple match types for a single deep link. URI argument matching is
prioritized first, followed by action, and then MIME type*/