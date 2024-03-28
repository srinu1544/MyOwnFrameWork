package com.example.myownframework.Kotlin_Android.Security

/*The Network Security Configuration feature uses an XML file where you specify
the settings for your app. You must include an entry in your app's manifest to
point to this file. The following code excerpt from a manifest demonstrates how
to create this entry:

A network security configuration file is an XML file that lets you customize
your app's network security settings without modifying the code. You can use the
file to configure app-wide and domain-specific settings

Protect apps from transmitting sensitive data: The feature protects apps from
unintentionally transmitting sensitive data in unencrypted cleartext.

Customize settings:
You can customize your app's network security settings for specific domains and
for a specific app.

Use base-config:
The base-config applies to all connections that the app attempts to make.

Use domain-config:
The domain-config overrides base-config for specific domains.

Create a new XML file:
You can create a new XML file under the xml folder of the app resources.




<?xml version="1.0" encoding="utf-8"?>
<manifest ... >
    <application android:networkSecurityConfig="@xml/network_security_config"
                    ... >
        ...
    </application>
</manifest>*/