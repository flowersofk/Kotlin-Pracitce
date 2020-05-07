package Array

fun main() {

    val b = Array<Any>(10, {0})

    b[0] = "Hello World"
    b[1] = 1.1

//    println(b[0])
//    println(b[1])
//    println(b[2])

//    b.forEach { element -> println("$element") }
//    b.forEachIndexed({i, e -> println("arr[$i] = $e")})

    var iter: Iterator<Any> = b.iterator()
    while(iter.hasNext()) {
        val e = iter.next()
        print("$e ")
    }

}