package com.example.myownframework.Kotlin_Android.DependencyInjections

/*

koin :
--------
 -> koin is light weight di framework that uses kotlin's features to provide a simple way to di
 -> it is pure kotlin di framework that does not rely on code generation but uses to DSL and reflection


// define a module

val appModule = module {
 single {AnalyticsService}
}

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        StartKoin {
        androidContext (this@MyApp)
        modules(appModule)
        }

    }
}

class MainActivity : AppCompactActivity() {

}


*/