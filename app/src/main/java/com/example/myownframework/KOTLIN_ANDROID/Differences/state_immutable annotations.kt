package com.example.myownframework.Kotlin_Android.Differences

/*@Immutable is an annotation to tell Compose compiler that this object is immutable for optimization, so without using it, there will be unnecessary re-composition that might get triggered.

@Stable is another annotation to tell the Compose compiler that this object might change, but when it changes, Compose runtime will be notified.

It might not make sense if you read up to here. So more explanation...*/