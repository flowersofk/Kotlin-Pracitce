package channel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

fun CoroutineScope.producer(): ReceiveChannel<Int> = produce {

    var total: Int = 0
    for(x in 1..5) {
        total += x
        send(total)
    }

}

fun main() = runBlocking{
    var result = producer()
    result.consumeEach { print("$it ") }
}