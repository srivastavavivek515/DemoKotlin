package com.example.demokotlin.dagger

import com.example.demokotlin.MainActivity
import dagger.Component

@Component(modules = [DaggerModule::class])
interface TestComponent {
    fun inject(daggerActivity: DaggerActivity)
}