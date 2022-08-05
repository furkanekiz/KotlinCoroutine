package com.furkanekiz.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    //Dispatchers
    //Dispatchers.Default -> CPU Intensive
    //Dispatchers.IO -> Input / Output, Networking
    //Dispatchers.Main -> UI
    //Dispatchers.Unconfined -> Inherited dispatcher

    //Run ACMain
    runBlocking {
        launch(Dispatchers.Main) {
            println("Main Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Main Default: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("Main IO: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined) {
            println("Main Unconfined: ${Thread.currentThread().name}")
        }
    }
}