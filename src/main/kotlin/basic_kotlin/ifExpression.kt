package basic_kotlin

fun main() {
    val exam =81

    if (exam > 90){
        println("awesome")
    } else if (exam>80) {
        println("cool")
    } else if (exam>68){
        println("not bad")
    } else{
        println("your not pass the exam")
    }


    fun exact(level:Int, point:Int) = if(point<level) println("gagal") else println("lulus")

    println(exact(90,60))
}