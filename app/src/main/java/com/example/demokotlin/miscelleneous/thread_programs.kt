package com.example.demokotlin.miscelleneous

import java.util.concurrent.ConcurrentHashMap

/*fun main() {
    val lock = Any()
    val threads = List(1000) {
        Thread {
            synchronized(lock){
                increment()
            }
        }
    }
    threads.forEach { it.start() }
    threads.forEach { it.join() }
    println("The value of counter is $counter")
}

var counter = 0
fun increment() {
    counter++
}*/


/*fun main(){
    var mutableHashMap = ConcurrentHashMap<Int,Int>()
    val threads = List(10){
        Thread{
           repeat(100) {
               mutableHashMap[it] = (mutableHashMap[it] ?: 0)+1
           }
        }
    }
    threads.forEach { it.start() }
    threads.forEach { it.join() }
    println("Threads size is ${mutableHashMap.size}")

}*/



