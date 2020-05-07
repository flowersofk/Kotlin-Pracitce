package Collection

fun main() {

    val fruits = listOf("apple", "banana", "kiwi")

    for(item in fruits) {

        println(item)

    }

    for(index in fruits.indices) {

//       if(index % 2 == 0) println("fruits[$index] = ${fruits[index]}")

    }

    var index = 0
    while(index < fruits.size) {

        println("fruits[$index] = ${fruits[index]}")
        index++
    }

    val emptyList: List<String> = emptyList<String>()
    val nonNullList: List<Int> = listOfNotNull(2, 45, 2, null, 5, null)
    println(nonNullList)


}