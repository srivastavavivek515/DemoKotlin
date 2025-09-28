package com.example.demokotlin.dagger

import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor(val wheel: Wheel,val engine: Engine){
    fun running(){
        wheel.engage()
        engine.started()
        println("Car is running..")
    }
}

class Engine @Inject constructor(){
    fun started(){
        println("engine started")
    }
}


class Wheel @Inject constructor(){
    fun engage(){
        println("Wheel engaged")
    }
}



interface StoreData{
    fun saveData(data:String)
}

class SaveDataInFirebase @Inject constructor() : StoreData{
    override fun saveData(data: String) {
        println("data stored in firebase")
    }
}
class SaveDataInRoom @Inject constructor(): StoreData{
    override fun saveData(data: String) {
        println("data stored in room database")
    }
}


class StorageRepo @Inject constructor(val storeData: StoreData){
    fun startSync(){
        storeData.saveData("")
    }
}