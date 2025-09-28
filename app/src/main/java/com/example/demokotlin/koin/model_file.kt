package com.example.demokotlin.koin

class College(val student: Student, val professor: Professor){
    fun running(){
        student.study()
        professor.teach()
        println("college is running...")
    }
}

class Student{
    fun study(){
        println("student is studying")
    }
}
class Professor{
    fun teach(){
        println("prof is teaching")
    }
}

interface StoreData1{
    fun saveData()
}


class SaveInFirebase1: StoreData1{
    override fun saveData() {
        println("Save data in firebase")

    }
}

class SaveInRoom1: StoreData1{
    override fun saveData() {
        println("save in room")
    }
}

class StorageRepo1(val storeData1: StoreData1){
    fun syncData(){
        storeData1.saveData()
    }
}


class Person(val name:String, val college:String){
    fun showInfo(){
        println("the info is $name and $college")
    }
}
