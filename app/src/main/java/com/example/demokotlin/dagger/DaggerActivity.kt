package com.example.demokotlin.dagger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demokotlin.R
import javax.inject.Inject
import javax.inject.Named

class DaggerActivity : AppCompatActivity() {
    private lateinit var testComponent: TestComponent
    @Inject
    lateinit var car: Car

    @DataAnnotation("fireRepo")
    @Inject
    lateinit var firebaseRepo: StorageRepo
    @DataAnnotation("roomRepo")
    @Inject
    lateinit var roomRepo: StorageRepo


    @Inject
    lateinit var runTimeValues: RunTimeValues

    @Inject
    lateinit var saveDataInFirebase: SaveDataInFirebase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dagger)
      /*  testComponent =  DaggerTestComponent.create()
        testComponent.inject(this)
        car.running()
        saveDataInFirebase.saveData("Firebase saved")
        firebaseRepo.startSync()
        roomRepo.startSync()*/

        testComponent = DaggerTestComponent.builder().passData("Hi Vivek").build()
        testComponent.inject(this)
        runTimeValues.showData()

    }
}