fun main() {
    val finalExam = "D"

    when(finalExam) {
        "A" -> {
            println("Awesome")
        }
        "B" -> {
            println("Cool")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else ->{
            println("Ups try next year")
        }
    }
}