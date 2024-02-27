package com.example.myownframework.Kotlin_Android.ThirdPartyLiibries

/*

third party Libraries used :
------------------------------

Retrofit
---------
Glide
-----
picasso
--------
Dagger 2
---------

volley
------

EventBus
--------
Description: Simplify communication between different parts of your application with this
publish/subscribe event bus optimized for Android. Example:
EventBus.getDefault().post(new MessageEvent("Hello!"));

OkHttp:
-------

Description: The foundation for many networking operations, OkHttp offers an efficient
way to make HTTP requests. Example:

OkHttpClient client = new OkHttpClient();
Request request = new Request.Builder().url(url).build();
Response response = client.newCall(request).execute();

 Gson
 ------
Description: Convert Java objects into JSON and back with ease using Google’s Gson library.
Example:

Gson gson = new Gson();
String json = gson.toJson(myObject);
MyObject obj = gson.fromJson(json, MyObject.class);


 MPAndroidChart :
 ---------------

Description: Need to visualize data? MPAndroidChart provides a comprehensive charting library for Android.
Example:

LineChart chart = findViewById(R.id.chart);
chart.setData(data);
chart.invalidate();


Zxing :
-------

Description: For barcode scanning capabilities, Zxing is the most trusted library. Example:

Just integrate the library, and you can leverage its powerful barcode scanning features through
dedicated intents.

Each of these third-party libraries underscores the spirit of the open-source
community: to collaboratively address common challenges and propel everyone forward.
By integrating these libraries, developers can supercharge their workflow, ensuring
the creation of efficient, feature-rich, and high-quality Android applications.


LeakCanary
-----------
Description: Ensuring your app doesn’t leak memory is crucial, and LeakCanary is the
guardian in this domain. Example:

Integrating LeakCanary will automatically alert you about potential memory leaks.

 */