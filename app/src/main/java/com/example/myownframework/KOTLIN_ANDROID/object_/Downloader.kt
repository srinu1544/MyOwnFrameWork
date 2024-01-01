package com.example.myownframework.Kotlin_Android.object_

import com.example.practiceapp.Kotlin_Android.object_.DownloadListener

class  Downloader {

    var downloadlistrner : DownloadListener? = null

    fun downloadFile(file : String) {
        downloadlistrner?.onDownloadStarted()
        for(i in 1..10){
            Thread.sleep(600)
            downloadlistrner?.onProgressUpdate(i * 10)
        }
        downloadlistrner?.onDownloadCompleted(file)
    }
}