package Collection.ExtensionMethod

fun main() {

    val unsortedList = listOf(3, 2, 7, 5)

    println(unsortedList.reversed())

    println(unsortedList.sorted())

    println(unsortedList.sortedDescending())

    println(unsortedList.sortedBy { it % 3 })

}