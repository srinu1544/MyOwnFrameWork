package com.example.myownframework.Kotlin_Android.Others

/*
The shareIn function returns a SharedFlow, a hot flow that emits values to all
consumers that collect from it. A SharedFlow is a highly-configurable generalization of StateFlow.

You can create a SharedFlow without using shareIn. As an example, you could use a SharedFlow to send ticks to the rest of the app so that all the content refreshes periodically at the same time. Apart from fetching the latest news, you might also want to refresh the user information section with its favorite topics collection. In the following code snippet, a TickHandler exposes a SharedFlow so that other classes know when to refresh its content. As with StateFlow, use a backing property of type MutableSharedFlow in a class to send items to the flow:*/