package com.example.myownframework.Kotlin_Android.DependencyInjections

/*

 https://developer.android.com/training/dependency-injection/hilt-jetpack
 official doc - https://developer.android.com/training/dependency-injection/hilt-android
 MyHilt refer with --  https://www.simplifiedcoding.net/android-hilt-tutorial/
                       https://www.youtube.com/watch?v=AzH18a0_Tt8&t=32s&ab_channel=SimplifiedCoding

 Hilt :
 -------
 -> Hilt is built on top of the Dagger2
 -> It simplifies dagger related infrastructure
 -> Hilt provides a standard way to incorporate Dagger dependency injection into an Android application.


The goals of Hilt are:
To create a standard set of components and scopes to ease setup,
readability/understanding, and code sharing between apps.

To provide an easy way to provision different bindings to various build types
(e.g. testing, debug, or release).

Class AnalyticsService @inject constructor

@HiltAndroidApp
Class MyApplication : Application


@AndroidEntryPoint
class MainActivity : AppCompactActivity(){
@inject lateinit val analytics : AnalyticsService


all annotations in hilt --- vvip
---------------------------------
@HiltAndroidApp:
 This annotation is used in your Application class to generate the necessary Dagger
 components for Hilt to work in your application. It replaces the need to manually
 create Dagger components and modules.

@AndroidEntryPoint:
This annotation is used to mark Android classes (activities, fragments, services, etc.)
where you want to inject dependencies using Hilt. When you annotate an Android class
 with @AndroidEntryPoint, Hilt will inject any annotated dependencies into that class.


@InstallIn:
This annotation is used to specify which component a module should be installed into.
It's typically used on Dagger modules. For example, @InstallIn(ApplicationComponent::class)
means the module will be installed in the ApplicationComponent, and the provided bindings
will be available throughout the application.


@Module:
 annotation is used on classes to indicate that they provide dependencies to
the dependency injection system. It's used in conjunction with @Provides or other Dagger
annotations to specify methods that provide instances of objects to be injected.


@Provides:
This annotation is used inside Dagger modules to denote methods that provide instances
classes to be injected. These methods typically return the instances of the classes you want to provide.

@Singleton:
 annotation is used to specify that the dependency provided by the annotated method should be
  treated as a singleton. This means that only one instance of the provided object will be
  created and shared throughout the application.


@Inject:
This annotation is used to mark constructors, fields, and methods to indicate that dependency
injection should be performed on them. When you annotate a constructor with @Inject,
will automatically know how to provide instances of that class.

@HiltViewModel:
This annotation is used to mark ViewModels to be injected by Hilt.
It simplifies ViewModel injection in Android apps that use Hilt for dependency injection.



Generated components
----------------------
Hilt component	              Injector for
---------------              --------------
SingletonComponent	           Application
ActivityRetainedComponent	      N/A
ViewModelComponent	            ViewModel
ActivityComponent	             Activity
FragmentComponent	             Fragment
ViewComponent	                   View
ViewWithFragmentComponent	   View annotated with @WithFragmentBindings
ServiceComponent	              Service



Component lifetimes
-----------------------
Hilt automatically creates and destroys instances of generated component
classes following the lifecycle of the corresponding Android classes.

Generated component	                 Created at	                               Destroyed at
SingletonComponent	              Application#onCreate()	               Application destroyed
ActivityRetainedComponent	        Activity#onCreate()                      Activity#onDestroy()
ViewModelComponent	                ViewModel created	                     ViewModel destroyed
ActivityComponent	                Activity#onCreate()	                     Activity#onDestroy()
FragmentComponent	                 Fragment#onAttach()	                  Fragment#onDestroy()
ViewComponent	                      View#super()	                             View destroyed
ViewWithFragmentComponent	           View#super()	                             View destroyed
ServiceComponent	                  Service#onCreate()	                     Service#onDestroy()




}

Intigration procedure :
-----------------------
-> in project's root build.gradle file: add
plugins {

 id("com.google.dagger.hilt.android") version "2.44" apply false
}

->  app/build.gradle add
plugins {
  kotlin("kapt")
  id("com.google.dagger.hilt.android")
}
-> in dependencies add
dependencies {
  implementation("com.google.dagger:hilt-android:2.44")
  kapt("com.google.dagger:hilt-android-compiler:2.44")
}

create application class and extend with Application
and application class @HiltAndroidApp

*/