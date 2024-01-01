package com.example.practiceapp.Kotlin_Android.Permissions

/*types of permissions in android
ChatGPT
In Android, permissions are used to control access to various system resources and data on
a device. There are several types of permissions in Android:

Normal Permissions:
These are permissions that are automatically granted to an app at
installation without any user intervention. They typically provide access to non-sensitive
resources or data that pose minimal risk to the user's privacy or device. Examples include
the "INTERNET" permission for internet access or "ACCESS_NETWORK_STATE" for checking
network status.

Dangerous Permissions:
These permissions are considered sensitive as they grant an app
access to potentially private or sensitive user data or device resources. Users are
prompted to grant or deny these permissions when the app requests them. Examples
include "READ_CONTACTS" for accessing contacts, "CAMERA" for using the camera,
and "LOCATION" for accessing the device's GPS.

Special Permissions:
Special permissions grant an app elevated access to certain system functions or resources.
They often require user approval and are subject to stricter scrutiny by the Android
operating system. Examples include "SYSTEM_ALERT_WINDOW" for drawing over other apps
and "WRITE_SETTINGS" for modifying system settings.

Signature Permissions:
These permissions are reserved for system apps that are signed with the same digital
certificate as the Android operating system. They are not available to regular third-party
apps and provide a high level of control and access to the device's functionality.

App-Defined Permissions:
Some apps define their custom permissions to control access to
specific features or data within the app itself. These permissions are not part of the
standard Android permission system and are typically used for internal app security.

Normal and Dangerous Permissions Groups:
Permissions in Android are organized into permission groups, where each group contains
related permissions. When an app requests a permission within a group, it is automatically
granted access to all permissions within that group. For example, the "READ_CONTACTS" and
"WRITE_CONTACTS" permissions both belong to the "CONTACTS" permission group.

Android's permission system is designed to protect user privacy and security by allowing
users to control which apps have access to their data and device resources. Starting with
Android 6.0 (Marshmallow), apps must request dangerous permissions at runtime, and users
have the ability to grant or deny these permissions on a per-app basis. This gives users
 more control over their privacy and security.*/