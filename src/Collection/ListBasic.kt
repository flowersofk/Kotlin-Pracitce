package Collection

fun main() {

    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("one", "two", "three")

    for(name in names) {
        println(name)
    }

    for(num in numbers) println(num)

    println( )
}