package Collection.Set

import java.util.LinkedHashSet

fun main() {

    val intsLinkedListHashSet: LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 26, 75)
    intsLinkedListHashSet.add(4)
    intsLinkedListHashSet.remove(21)
    println(intsLinkedListHashSet)

    intsLinkedListHashSet.clear()
    println(intsLinkedListHashSet)

}