package Collection.Map

fun main() {

    val capitalCityMap: MutableMap<String, String> = mutableMapOf("Korea" to "Seoul", "China" to "beijing", "Japan" to "Tokyo")

    println(capitalCityMap.values)
    println(capitalCityMap.keys)

    capitalCityMap.put("UK", "London")
    capitalCityMap.remove("China")

    val addData = mutableMapOf("USA" to "Washington")
    capitalCityMap.putAll(addData)

    println(capitalCityMap)

}