package com.example.myownframework.Kotlin_Android.Differences

/*

LiveData and MutableLiveData are both components in Android development that help create
responsive user interfaces. The main difference between the two is that LiveData is immutable,
while MutableLiveData extends LiveData's functionality by allowing value modification.


Here are some other differences between LiveData and MutableLiveData:
----------------------------------------------------------------------
Data observation
LiveData allows you to observe and utilize its value, but you can't change it. MutableLiveData is
a subclass of LiveData that allows you to observe and set values using the postValue() and setValue()
methods.

Data modification
LiveData has no publicly available methods to update the stored data. MutableLiveData exposes the
setValue(T) and postValue(T) methods publicly, which you must use to edit the value stored in a
LiveData object.

When to use
Use LiveData when you don't want your data to be modified. Use MutableLiveData when you want to
modify your data later. For example, you can use MutableLiveData to update RecyclerView records
 whenever the LiveData changes.*/