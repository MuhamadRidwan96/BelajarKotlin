package basic_kotlin

fun main() {

    val rows = 5

    for(i in rows downTo 1){
        for(space in 1..rows -i){
            print("#")
        }

        for(j in i until 2 * i){
            print("*")
        }

        for(j in 0 until i - 1){
            print("*")
        }
        println()
    }

    //return unit
    fun sum(a :Int = 10,b :Int = 5): Int{
        return a + b
    }

    //return type
    fun times(a : Int = 2, b : Int = 3){
        println("hasil dari function diatas ${a*b}")
    }

    println(sum())
    println(times())
}