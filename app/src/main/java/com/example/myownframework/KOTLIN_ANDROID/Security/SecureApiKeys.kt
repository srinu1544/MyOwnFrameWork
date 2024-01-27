package com.example.myownframework.Kotlin_Android.Security

/*


https://www.youtube.com/watch?v=-2ckvIzs0nU&ab_channel=PhilippLackner

example in this project


How to hide api keys from version control
------------------------------------------



-> switch to project view
-> goto build.gradle file
-> In defaultConfig block

  val properties : Properties = Properties()
        properties.load(project.rootProject.file("local.properties").inputStream())

        buildConfigField ("String", "API_KEY" ,"\"${properties.getProperty("API_KEY")}\"")

->  add this above code in default config block
-> goto local properties file
-> sync
-> Rebuild project in build


and change minifyEnable true ->
this is enable R8

*/