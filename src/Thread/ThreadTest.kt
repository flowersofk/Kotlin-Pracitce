package Thread

class SimpleThread: Thread() {
    override fun run() {
        println("current Thread : ${Thread.currentThread()}")
    }
}

class SimpleRunnable: Runnable {
    override fun run() {
        println("current Thread : ${Thread.currentThread()}")
    }
}

fun main() {

    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

    Thread({println("current Thread(lambda) : ${Thread.currentThread()}")}).start()

    object : Thread() {
        override fun run() {
            println("current Thread(object) : ${Thread.currentThread()}")
        }
    }.start()

}