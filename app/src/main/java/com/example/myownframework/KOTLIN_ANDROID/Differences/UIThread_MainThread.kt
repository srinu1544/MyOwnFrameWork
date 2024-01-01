package com.example.myownframework.Kotlin_Android.Differences

/*In Android, the main thread is the first thread to run when an application starts.
It's also known as the UI thread because all user interface (UI) actions occur on it.
The main thread handles:
Processing data
Handling requests
Other main tasks
Initializing Data and UIImage instances
The UI thread handles user requests via the UI. It:
Requests information from the main thread
Sends instructions to the main thread
Resumes normal activity without waiting for a response
Handles data from the main thread

The distinction between UI and main threads is only important in the context of some system
 applications */