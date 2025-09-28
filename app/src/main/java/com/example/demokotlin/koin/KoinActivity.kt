package com.example.demokotlin.koin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demokotlin.R
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf
import org.koin.core.qualifier.named

class KoinActivity : AppCompatActivity() {
    lateinit var koinDaggerComponent: MyComponent
   // val storageRepo1: StorageRepo1 by inject()
    val firebaseStore: StoreData1 by inject (named("firebase1"))

    val storageRepo1: StorageRepo1 by inject { parametersOf(firebaseStore) }

    val person: Person by inject { parametersOf("vivek","psit") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_koin)
        koinDaggerComponent = MyComponent()
        koinDaggerComponent.college.running()
        //storageRepo1.syncData()
      //  firebase1.saveData()
       // storageRepo1.syncData()
        person.showInfo()

    }
}