package Collection.ExtensionMethod

fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("c", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    println(listPair)

//    list.forEach {print("$it ")}
//    list.forEachIndexed { index, value -> println("index[$index] : $value") }

//    val returnedList = list.onEach { print(it) }
//    println()
//    val returnedMap = map.onEach { println("Key : ${it.key}, value : ${it.value} ") }
//
//    println("returnedList = $returnedList")
//    println("returnedMap = $returnedMap")
//
//    println(list.count { it % 2 == 0 })
//
//    println(list.max())
//    println(list.min())

//    println("maxBy : " + map.maxBy { it.key })
//    println("minBy : " + map.minBy { it.key })

//    val returnList = list.onEach { println(it) }
//    println()
//    val returnMap = map.onEach { println("Key : ${it.key}, value : ${it.value}" ) }
//    println("returnList = $returnList")
//    println("returnMap = $returnMap")

//    println(list.fold(4) { total, next -> total + next})
//    println(list.fold(4, {total, next -> total + next}))
//    println(list.fold(1) { total, next -> total * next})

//    println(list.foldRight(4) { total, next -> println("next $next total $total") (total * next})

//    val list = listOf(1, 2, 3, 4, 5)
//    val sumTotal = list.foldRight(list.first(), { next, total ->
//        println("next $next total $total")
//        next + total
//    })

//    val fruitList = list.foldRightIndexed(0, { index, fruitPrice, total ->
//        println("\n index $index fruitPrice $fruitPrice total $total ")
//        fruitPrice + total
//    })
//
//    println(fruitList)

    println(listPair.sumBy { it.second })
}