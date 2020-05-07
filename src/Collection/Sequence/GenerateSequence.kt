package Collection.Sequence

fun main() {

    val nums: Sequence<Int> = generateSequence(1) { it + 1}

    println(nums.take(10).toList())

    val squares = generateSequence(1) { it + 1 }.map { it * it }
    println(squares.take(10).toList())

    val oddSquare = squares.filter { it % 2 != 0 }
    println(oddSquare.take(10).toList())



}