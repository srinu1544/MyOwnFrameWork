package com.example.myownframework.Kotlin_Android.LiveData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/*


code example in MyOwnFrameWork

livedata so called state holder it holds ui state in the end if any value in your ui changes
overtime

livedata is notify some thing has changed

LiveData is an observable data holder class. Unlike a regular observable,
LiveData is lifecycle-aware, meaning it respects the lifecycle of other app
components, such as activities, fragments, or services. This awareness ensures
LiveData only updates app component observers that are in an active lifecycle state.



 While working with LiveData we can use two different methods to update its value. Methods are

setValue()
postValue()
By name, these two functions are quite confusing, as they appear to serve the same purpose. However,
 the reality is quite different.

What exactly is LiveData?
If you know this already as the Android expert , skill this part

LiveData is a data holder that is used to monitor changes to a specific view and then update the
corresponding change.

As a result, LiveData is used to simplify the task of implementing ViewModel. The best part about
LiveData is that when your View is in the background, the data is not updated; however, when the View
comes into the foreground, it only receives the updated data.( TIP : if you tell this in interview ,
it will show that you know the deep knowledge 😀)

Benefits of LiveData include:

There are no memory leaks.
Views always receive the most recent data.
There was no crash as a result of the halting of activities.
Difference between setValue() and postValue()
SetValue(): When changing the data on the Main thread, use the MutableLiveData class’s setValue method. The setValue() function is called from the main thread

postValue(): when changing the LiveData on the background thread, use the MutableLiveData class’s postValue method. The postValue() function is called from a background thread.

Example : if postValue is called four times before the main thread is executed, the observer will receive the notification only once, and that too with the most recently updated data, because the notification is scheduled to be executed on the main thread. So, if you call the postValue method multiple times before the main thread executes, the value that was passed last, i.e. the latest value will be used, and all the previous ones will be discarded

Another thing to keep in mind about postValue is that if the field on which the postValue is called does not have any observers and you then call getValue, you will not receive the value that you set in the postValue because there is no observer here.


*/


class MyLiveData : ViewModel() {


    private val _user = MutableLiveData<String>()

    // LiveData is exposed as read-only
    val user: LiveData<String>  = _user




}