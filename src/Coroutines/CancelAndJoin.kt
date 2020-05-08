package Coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {

    val startTime = System.currentTimeMillis()
    val jobs = GlobalScope.launch {
        var nextPrintTime = startTime
        var i = 0
        while(i < 5) {
            if(System.currentTimeMillis() >= nextPrintTime) {
                println("I'm sleeping ${i++}...")
                nextPrintTime += 500L
            }
        }
    }

    delay(1300L)
    println("main : I'm tired of waiting")
    jobs.cancelAndJoin()
    println("main : Now I can Quit")


}