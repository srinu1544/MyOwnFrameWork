package com.example.myownframework.Kotlin_Android.Others

/*
https://developer.android.com/guide/topics/media/platform/mediaplayer


The Android multimedia framework includes support for playing variety of common media types,
so that you can easily integrate audio, video and images into your applications. You can
play audio or video from media files stored in your application's resources
(raw resources), from standalone files in the filesystem, or from a data stream
arriving over a network connection, all using MediaPlayer APIs.

This document shows you how to use MediaPlayer to write a media-playing application
that interacts with the user and the system in order to obtain good performance and
a pleasant user experience. Alternatively, you might want to use ExoPlayer, which is
a customizable open source library that supports high-performance features not available
in MediaPlayer


The basics
The following classes are used to play sound and video in the Android framework:
MediaPlayer
This class is the primary API for playing sound and video.
AudioManager
This class manages audio sources and audio output on a device.


Manifest declarations

Before starting development on your application using MediaPlayer, make sure your manifest
has the appropriate declarations to allow use of related features.

Internet Permission -

If you are using MediaPlayer to stream network-based content, your
application must request network access.

<uses-permission android:name="android.permission.INTERNET" />

Wake Lock Permission -
If your player application needs to keep the screen from dimming or the processor
from sleeping, or uses the MediaPlayer.setScreenOnWhilePlaying()
or MediaPlayer.setWakeMode() methods, you must request this permission.

<uses-permission android:name="android.permission.WAKE_LOCK" />









*/