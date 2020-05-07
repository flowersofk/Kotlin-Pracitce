package Collection.ExtensionMethod

fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100), Pair("D", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    println("binarySearch : " + list.binarySearch(3))
    println("find : " + list.find{it > 3})

//    println("single : " + listPair.single() { it.second == 100})
//    println("singleOrNuill : " + listPair.singleOrNull { it.second == 500 })

//    println(list.indexOf(4))

//    println("first : " + listPair.first() {it.second == 200})
//    println("last :"  + listPair.last() { it.second == 200})
//
//    println("firstOrNull : " + listPair.firstOrNull() {it.first == "A"})
//    println("lastOrNull : " + listPair.lastOrNull() {it.first == "E"})

//    println("elementsAt : " + list.elementAt(1))
//    println("elementAtOrElse : " + list.elementAtOrElse(8, {it * 2}))
//    println("elementAtOtNull : " + list.elementAtOrNull(2))
}