fun main() {
    val finalExam = "D"
    val passValues = arrayOf("A","B","C")

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

    when(finalExam){
        "A","B","C"->{
            println("Anda lulus")
        } else ->{
            println("Coba lagi tahun depan")
        }
    }

    when(finalExam){
        in passValues->{ println("Pass") }
        !in passValues->{ println("tidak lulus") }
    }

    val name = "Eko"
    when (name){
        is String -> println("Adalah String")
        !is String -> println("Bukan string")
    }

    val nilai = 90

    when{
        nilai > 90 -> println("awesome")
        nilai > 80 -> println("good job")
        nilai > 68 -> println("not bad")
        else-> println("coba lagi")
    }
}