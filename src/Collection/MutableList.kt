package Collection

fun main() {

    val mutableList: MutableList<String> = mutableListOf<String>("kildong", "Dooly", "Chelsu")
    mutableList.add("Ben")
    mutableList.removeAt(1)
    mutableList[0] = "Sean"
    println(mutableList)

    val mutableListMixed = mutableListOf("Android", "Apple", 5, 6, 'X')
    println(mutableListMixed)


}