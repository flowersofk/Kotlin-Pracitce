package lambda

fun main() {

    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "kotlin")
    val a = person.let {
        it.skills = "Android"
        "success"
    }

    println(person)
    println("a : $a")
    println()

    val b = person.also{
        it.skills = "Java"
        "success"
    }

    println(person)
    println("b : $b")

}