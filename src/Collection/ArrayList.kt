package Collection

fun main() {

    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "kotlin", "Wow")

    stringList.add("Java")
    stringList.remove("Hello")

    println(stringList)

}