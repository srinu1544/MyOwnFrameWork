package com.example.myownframework.Kotlin_Android.Security

/*
SSL pinning, or certificate pinning, is a technique that helps protect against man-in-the-middle
attacks on secure HTTPS communication. It involves including a server certificate directly in a
mobile application. This approach is secure against man-in-the-middle attacks when the device's
trust store is compromised.

SSL pinning works by:

Associating a host with its expected X509 certificate or public key
Pinning the certificate or public key to that host

**Ensuring that the application only communicates with a server whose SSL certificate or public key
has been “pinned” within the application

An example of SSL pinning is a mobile banking app that uses SSL pinning. When the user opens the app,
it initiates an SSL/TLS connection with the bank's server. The bank's server sends its public key to
the app, which verifies the digital certificate against the trusted CA.

To check if an Android application has SSL pinning, you can:
Go to the Security Analysis tab
Click on File Analysis
Look for the keywords "Certificate/Key Files Hard-coded inside the App" or "Hardcoded Keystore Found"*/