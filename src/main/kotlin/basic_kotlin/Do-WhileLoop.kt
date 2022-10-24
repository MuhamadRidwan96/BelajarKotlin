package basic_kotlin

fun main() {

    //factorial
    var number = 6
    var factorial = 1

    do {
        factorial *= number
        --number
    } while (number > 0)
    println("the factorial 6 is $factorial")


}