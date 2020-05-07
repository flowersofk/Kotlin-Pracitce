package Array

fun main() {

    val fruits = arrayOf("banana", "avocade", "apple", "kiwi")

    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map {it.toUpperCase()}
            .forEach {println(it)}

    when {
        "apple" in fruits -> println("Apple!")
    }

}