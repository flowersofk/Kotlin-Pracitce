package Array

fun main() {

    val arr = intArrayOf(1, 2, 3, 4, 5)

//    println("arr : ${Arrays.toString(arr)}")
//    println("size :  ${arr.size}")
//    println("sum() : ${arr.sum()}")
//
//    println(arr.get(2))
//    println(arr[2])
//
//    arr.set(2, 7)
//    arr[0] = 8
//    println("size : ${arr.size} arr[0] : ${arr[0]}, arr[2] : ${arr[2]}")
//
//    for(i in 0..arr.size - 1) {
//        println("arr[$i] = ${arr[i]}")
//    }
//
//    println("arr.size : ${arr.size}")
//    println("arr.count() : ${arr.count()}")
//    println("arr.indexOf(3) : ${arr.indexOf(3)}")
//    println("arr.average : ${arr.average()}")

    var arr1 = Array(5, {i -> i * 5})

    var arr2 = arrayOfNulls<Int>(5)

    var arr3 = Array(5, {0})

    var arr4 = Array(5, {i -> test(i) })

//    println("arr : ${Arrays.toString(arr4)}")

    for( i in arr4) {
        println("count : ${i.i1}")
    }

}

class test(i1: Int){
    var s1 = "Test";
    var i1 = 0;
}