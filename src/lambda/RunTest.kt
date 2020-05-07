package lambda
fun main () {

    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "kotlin")

    val returnObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "success"
    }

    println(person)
    println("returnObj : $returnObj")
    println()
    val returnObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success"
    }

    println(person)
    println("returnObj2 : $returnObj2")
}