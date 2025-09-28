package com.example.demokotlin.koin

import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {

    factory {
        Student()
    }
    factory {
        Professor()
    }

    factory {
        College(get(), get())
    }

    factory<StoreData1>(named("firebase1")) {
        SaveInFirebase1()
    }

    factory<StoreData1>(named("room1")) {
        SaveInRoom1()
    }

    factory {
        (storeData:StoreData1)->
        StorageRepo1(storeData)
    }
    factory {
        (name:String,college:String)->
        Person(name,college)
    }
}
