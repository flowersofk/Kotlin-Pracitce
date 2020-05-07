package lambda

fun main() {

    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "kotlin")
        person.apply { this.skills = "Java" }

    println(person)

    val returnObj = person.apply {
        this.name = "Sean"
        skills = "C++"
    }

    println(person)
    println(returnObj)

}