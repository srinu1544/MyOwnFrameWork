package com.example.myownframework.Kotlin_Android.Object_

interface  DownloadListener {

    fun onDownloadStarted()
    fun onDownloadCompleted(file : String)

    fun onProgressUpdate(progress : Int)
}

