package com.example.demokotlin.koin

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MyComponent : KoinComponent {
    val college: College by inject()

}