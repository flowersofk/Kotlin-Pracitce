package Array

data class Product(val name: String, val price: Double)

fun main() {

    val products = arrayOf(
            Product("Snow Ball", 870.00),
            Product("Smart Phone A", 999.00),
            Product("Drone", 240.00),
            Product("Mouse", 633.55),
            Product("Keyboard", 125.99),
            Product("Smart Phone B", 1500.99),
            Product("Mouse", 512.99))

//    products.sortBy { it.price }

//    products.sortWith(
//            Comparator<Array.Product> {p1, p2 ->
//                when {
//                    p1.price > p2.price -> 1
//                    p1.price == p2.price -> 0
//                    else -> -1
//                }
//            }
//    )

    products.sortWith(compareBy({it.name}, {it.price}))
//    products.forEach { println(it) }

    println(products.minBy { it.price })
    println(products.maxBy { it.price })

}