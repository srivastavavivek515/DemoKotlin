package com.example.demokotlin.dagger

import com.example.demokotlin.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [DaggerModule::class])
interface TestComponent {
    fun inject(daggerActivity: DaggerActivity)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun passData(@Named("baseUrl")data:String): Builder
        fun build(): TestComponent
    }
}