package com.example.myownframework.Kotlin_Android.Others

/*

ADB, or Android Debug Bridge, is a command-line tool that is part of the Android SDK
(Software Development Kit). It allows developers and advanced users to interact with an
Android device or emulator from a computer to perform various tasks, such as installing
and debugging apps, transferring files, accessing system logs, and more.

Here are some common ADB commands and their purposes:

adb devices:
Lists all connected Android devices and emulators.

adb install <path/to/app.apk>:
Installs an Android application onto the connected device or
emulator.

adb uninstall <package_name>:
Uninstalls an app from the connected device or emulator.

adb push <local_path> <device_path>:
Copies a file or directory from your computer to the device.

adb pull <device_path> <local_path>:
Copies a file or directory from the device to your computer.

adb shell:
Opens a shell session on the connected device, allowing you to run various
Linux/Android shell commands.

adb logcat:
Displays real-time logs from the Android system and apps. Helpful for debugging.

adb reboot:
Reboots the connected device.

adb backup:
Creates a backup of an app or the device's data.

adb restore:
Restores a previously created backup to the device.

adb sideload <update.zip>:
Sideloading is used for manually installing OTA
(Over-The-Air) updates or custom ROMs.

adb forward <local> <remote>:
Forwards network ports from the device to the host computer.

adb shell am:
 Used for various activity manager operations, such as starting activities and broadcasting intents.

adb shell pm:
Used for package manager operations, like enabling/disabling apps.

adb devices -l:
Lists devices and provides additional information like device IDs, product names, and more.

adb disconnect:
Disconnects the ADB connection from the device.

adb logcat -c:
Clears the logcat buffer.

adb shell screencap:
 Takes a screenshot of the device's screen and saves it to the computer.

adb shell screenrecord:
Records the screen and saves it as a video file on the device.

adb shell wm size:
 Sets the screen size of the device (useful for testing different screen resolutions).

Please note that using ADB commands requires enabling Developer Options and USB
Debugging on your Android device. Additionally, some commands may require root
access on the device, and improper use of ADB can potentially harm your device
or result in data loss, so use it with caution.*/
