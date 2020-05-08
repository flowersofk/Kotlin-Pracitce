package Coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    GlobalScope.launch {
        delay(1000L)
        println("World")

        doSomething()
    }

    println("Hello")
    Thread.sleep(2000L)

}

/**
 * 'suspend' 키워드는 코루틴 내에서만 사용 가능
 */
suspend fun doSomething() {
    println("Call dosomething")
}