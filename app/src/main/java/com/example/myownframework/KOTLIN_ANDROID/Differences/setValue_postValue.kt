package com.example.myownframework.Kotlin_Android.Differences

/*


 setValue()
 ----------
This method is used to change data using the main thread. It calls the value twice, updates
the value twice, and notifies observers twice.


postValue()
-----------
This method is used to change LiveData using the background thread. It's not lifecycle aware.

 */