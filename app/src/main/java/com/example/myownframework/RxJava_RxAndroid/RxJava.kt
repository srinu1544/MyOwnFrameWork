package com.example.myownframework.RxJava_RxAndroid

import android.annotation.SuppressLint
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

/*fun main() {



        .filter { item -> item == "Red" }
        .subscribe{ onNext -> println("name $onNext")}





}*/


@SuppressLint("CheckResult")
fun main() {


    Observable.fromArray("Red", "Blue", "green")


   val obsrvable =  Observable.just("Red", "Blue", "green")

  val range =  Observable.range(1,15)


    range.subscribeOn(Schedulers.io())
    range.observeOn(Schedulers.io())
    range.subscribe{onNext -> println(onNext)}

    obsrvable.subscribe(object : Observer<String>{
        override fun onSubscribe(d: Disposable) {
            TODO("Not yet implemented")
        }

        override fun onError(e: Throwable) {
            TODO("Not yet implemented")
        }

        override fun onComplete() {
            TODO("Not yet implemented")
        }

        override fun onNext(t: String) {
            TODO("Not yet implemented")
        }
    })


}