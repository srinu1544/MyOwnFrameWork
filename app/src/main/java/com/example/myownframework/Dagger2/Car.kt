package com.example.myownframework.Dagger2

import javax.inject.Inject

class Car {

    lateinit var wheels: Wheels
    lateinit var engine: Engine

    @Inject
    constructor(wheels: Wheels,engine: Engine){
        this.engine = engine
        this.wheels = wheels
    }

    fun start(){
        println("driving")
    }
}