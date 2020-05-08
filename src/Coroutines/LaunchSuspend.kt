package Coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun doWork1(): String {
    delay(1000L)
    return "Worl1"
}

suspend fun doWork2(): String {
    delay(10000L)
    return "Work2"
}

private fun workInSerial() {
    GlobalScope.launch {
        val one = doWork1()
        val two = doWork2()
        println("Kotlin One : $one")
        println("Kotlin One : $two")
    }
}

private fun worksInParallel() {

    val one = GlobalScope.async {
        doWork1()
    }

    val two = GlobalScope.async {
        doWork2()
    }

    GlobalScope.launch {
        val combined = one.await() + "_" + two.await()
        println("Kotlin Combined : $combined")
    }

}

fun main() {

//    workInSerial()
//    readLine()

    worksInParallel()
    readLine()
}