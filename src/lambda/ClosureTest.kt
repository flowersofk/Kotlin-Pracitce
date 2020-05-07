package lambda

fun main() {

    val calc = Calc()
    var result = 0
    calc.addNum(2, 3) { x, y -> result = x + y}
    println(result)

    filterNames(4)

}

fun filterNames(length: Int) {
    val names = arrayListOf("kim", "Hong", "Go", "Hwang", "Jeon")
    val filterResult = names.filter { it.length == length }
    println(filterResult)
}

class Calc {

    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) {
        add(a, b)
    }

}

