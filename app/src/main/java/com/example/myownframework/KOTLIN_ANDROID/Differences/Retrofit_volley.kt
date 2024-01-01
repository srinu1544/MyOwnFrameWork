package com.example.myownframework.Kotlin_Android.Differences

/*Retrofit :

It can parse many other types of responses automatically like:
Boolean: Web API response, to be a boolean.
Integer: Web API response, to be an integer.
Date: Web API response, to be a Long format date.
String: Web API response, to be in String format.
Object: Web API response, to be in a JSON object.
Collections: Web API response, to be in a String Format.

Retrofit does not support caching.

Retrofit does not support any retrying mechanism. But it can be achieved manually
by doing some extra code.

Retrofit has full support for Post Requests and Multipart uploads.


Volley :
--------
StringRequest: Request converts the response into a String.
JsonObjectRequest: Request and response automatically converted into a JSONObject.
JsonArrayRequest: Request and response automatically converted into a JSONArray.
ImageRequest: Request converts the response into a decoded bitmap.


Volley has a flexible caching mechanism. When a request is made through volley first the
cache is checked for an appropriate response. If it is found there then it is returned and
parsed else a network hit is made.

In Volley, we can set a retry policy using the setRetryPolicy method.
It supports the customized request timeout, number of retries, and backoff multiplier.

Volley supports both post requests and multipart uploads but for post requests, we have to
convert our java objects to JSONObject. Also for multipart uploads, we have to do some
extra code and use some additional classes







*/