package lambda

fun main() {

    val score: Int? = 32

    fun scoreCheck() {

        if(score != null)
            println("Score : $score")

    }

    fun checkScoreLet() {

        score?.let {
            println("Score : $it")
        }
        val str = score.let { it.toString()}
        println(str)

    }

    scoreCheck()
    checkScoreLet()

}