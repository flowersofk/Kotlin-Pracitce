package Array

import java.util.*

fun main() {

    var arr = arrayOf(8, 4, 3, 2, 5, 9, 1)

    val sortedNums = arr.sortedArray()
//    println("ASC : " + Arrays.toString(sortedNums))

    val sortedNumsDesc = arr.sortedArrayDescending()
//    println("DEC : " + Arrays.toString(sortedNumsDesc))

    arr.sort(1, 3)
//    println("ORI : " + Arrays.toString(arr))

    arr.sortDescending()
//    println("ORI : " + Arrays.toString(arr))

    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()

//    println("LST : " + listSorted)
//    println("LST : " + listDesc)

    val item = arrayOf<String>("Dog", "Cat", "Lion", "Kanagaroo", "Po")
    item.sortBy { i -> i.length }
    println(Arrays.toString(item))

}