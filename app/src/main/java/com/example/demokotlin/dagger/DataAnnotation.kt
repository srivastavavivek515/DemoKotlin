package com.example.demokotlin.dagger

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier
annotation class DataAnnotation(val info:String)
