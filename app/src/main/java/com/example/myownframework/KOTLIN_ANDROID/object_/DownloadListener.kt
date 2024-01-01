package com.example.myownframework.Kotlin_Android.object_

interface  DownloadListener {

    fun onDownloadStarted()
    fun onDownloadCompleted(file : String)

    fun onProgressUpdate(progress : Int)
}

