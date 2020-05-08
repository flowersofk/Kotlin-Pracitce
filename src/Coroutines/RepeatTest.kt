package Coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {

    val jobs = launch {
        try {
            repeat(1000) {
                i -> println("I'm sleeping")
                delay(500)
            }
        } finally {
            println("Bye!!")
        }

    }

    delay(1300)
    jobs.cancelAndJoin()
    println("main : Quit!")


}