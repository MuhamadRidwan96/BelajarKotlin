package latihanKotlin

fun main() {
    var x  = 1
    val result0 =10
    var t1 = 0
    var t2 = 1

    for (i in 1..result0){
       print("$t1 + ")
        val sum = (t1+t2)
        t1=t2
        t2 =sum
    }
    println()

    while (x <= result0){
        print("$t1 + ")
        val sum2 = (t1+t2)
        t1 = t2
        t2 = sum2
        x++
    }
}