package basic_kotlin

fun main() {

    print("this is your input: ")
    val input = readLine()!!
    println()
    //Convert String to Int
    val integerValue:Int = input.toInt()
    println("your entered $integerValue")

    print("this is your input double: ")
    val input1 = readLine()!!
    println()

    val doubleValue:Double = input1.toDouble()
    println("this is your double value $doubleValue")

    val myValue = 200
    val myLongValue: Long = myValue.toLong()

    println("this is my long value : $myLongValue")
}