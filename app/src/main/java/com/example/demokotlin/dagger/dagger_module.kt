package com.example.demokotlin.dagger

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class DaggerModule{

    @DataAnnotation("fireDB")
    @Binds
    abstract fun getFirebaseData(saveDataInFirebase: SaveDataInFirebase): StoreData

    @DataAnnotation("roomDB")
    @Binds
    abstract fun getRoomData(saveDataInRoom: SaveDataInRoom): StoreData

    companion object{
        @DataAnnotation("fireRepo")
        @Provides
        fun getFirebaseRepo(@DataAnnotation("fireDB") storeData: StoreData): StorageRepo{
            return StorageRepo(storeData)
        }

        @DataAnnotation("roomRepo")
        @Provides
        fun getRoomRepo(@DataAnnotation("roomDB") storeData: StoreData): StorageRepo{
            return StorageRepo(storeData)
        }

        @Provides
        fun getRunTimeValue(@Named("baseUrl")data:String): RunTimeValues{
            return RunTimeValues(data)
        }
    }
}