package Coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val jobs = List(100_100){
        launch {
            delay(1000)
            print(".")
        }
    }
    jobs.forEach {it.join()}
}