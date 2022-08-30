package app

fun main() {
    fun compare(n : Int):Int{
        var result= 0
        for(i in 1..n){
            result += i
        }
        return result
    }
    println(compare(4))}
