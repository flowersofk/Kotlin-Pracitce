package Collection.ExtensionMethod

fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    println(list.flatMap { listOf(it, 'A') })
    val result = listOf("abc", "12").flatMap { it.toList() }
    println(result)

    val grpMap = list.groupBy { if(it % 2 == 0) "even" else "odd" }
    println(grpMap)


//    println(list.map { it * 2 })
//    val mapIndexed = list.mapIndexed { index, i -> index * i }
//    println(mapIndexed)
//
//    println(listWithNull.mapNotNull { it?.times(3) })  // times 곱하기

}