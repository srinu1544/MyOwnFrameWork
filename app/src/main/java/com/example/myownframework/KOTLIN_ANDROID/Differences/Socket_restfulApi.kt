package com.example.myownframework.Kotlin_Android.Differences

/*REST API and Web Socket API serve different purposes and are used in different
contexts. REST API is used for stateless, request/response communication over HTTP,
while Web Socket API is used for persistent, bi-directional communication over the
WebSocket protocol.



RESTful APIs and socket/etc. communication are two different ways for mobile apps to
communicate with servers.

REST (Representational State Transfer) is a set of architectural principles that defines
how web services should be designed. RESTful APIs are based on these principles and are
designed to work with the HTTP protocol. They use standard HTTP methods like GET, POST,
PUT, and DELETE to interact with a server, and the data is usually exchanged in a format
like JSON or XML.

On the other hand, socket communication is a way for a mobile app to open a direct connection
to a server, and then send and receive data through that connection. Socket communication uses
low-level, binary protocols like TCP and UDP, and can be faster and more efficient than RESTful
APIs for certain types of real-time data transfer. However, it also requires more work to set
up and maintain the connection, and may not be as well-suited for some types of data transfer,
such as large files.
Socket programming is a way for devices to communicate over a network. Two sockets communicate,
one on the client-side and one on the server-side. A socket's address consists of an IP and a port.

Where is socket programming used?
Sockets are useful for both stand-alone and network applications. Sockets allow you to exchange
information between processes on the same machine or across a network, distribute work to the
most efficient machine, and they easily allow access to centralized data

WebSockets have a low overhead per message. They're ideal for use cases that require low-latency,
 high-frequency communication. REST APIs have a higher message overhead compared to WebSockets.
 They're best suited for use cases where you want to create, retrieve, delete, or update resources.


In summary, RESTful APIs are a simple, flexible, and widely-used way for mobile apps to
communicate with servers using standard HTTP methods and can be used for both real-time
 and non-real-time communication, whereas socket communication allows for a direct connection
 between the mobile app and server and can be more efficient for real-time data transfer,
 but requires more work to set up and maintain the connection.*/