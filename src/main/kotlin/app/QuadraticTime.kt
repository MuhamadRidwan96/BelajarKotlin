package app

fun main() {
    fun multipleNumber(size:Int){
        for(number in 1..size){
            print("|")
            for(otherNumber in 1..size){
                print("$number X $otherNumber = ${number*otherNumber}|")
            }
            println()
        }
    }
    println(multipleNumber(10))
}