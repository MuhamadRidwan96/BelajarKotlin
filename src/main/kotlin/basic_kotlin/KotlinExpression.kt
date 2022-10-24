package basic_kotlin

fun sumOf(a:Int,b:Int):Int{
    return a+b
}

fun main() {
    val a =10
    val b = 15
    val sum = sumOf(a,b)
    val mul = a * b

    println(sum)
    println(mul)

    // Kotlin if expression

    val c = 1000
    val d = 999
    val e = 1112

    val max = if (c > d) c else d
    val maxOf = if (e > c) e else c

    println("the maximum of $c and $d is $max")
    println("the maximum of $e and $c is $maxOf")

    //Kotlin Block
    val array = intArrayOf(2,3,4,5,6)

    for (element in array){
        print(element)
    }
}