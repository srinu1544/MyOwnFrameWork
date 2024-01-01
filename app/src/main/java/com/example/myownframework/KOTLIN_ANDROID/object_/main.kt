package com.example.myownframework.Kotlin_Android.object_


fun main() {

    val downloader = Downloader()
    downloader.downloadlistrner = object :
        DownloadListener {

        override fun onDownloadStarted() {
            println("download started...")
        }

        override fun onDownloadCompleted(file: String) {
            println("$file downloaded.")
        }

        override fun onProgressUpdate(progress: Int) {
            println("$progress% downloaded")
        }
    }
    downloader.downloadFile("fileA.mkv")

}