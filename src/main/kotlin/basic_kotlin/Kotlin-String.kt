package basic_kotlin

fun main() {
    val g = "GeeksForGeeks"
    print("${g.subSequence(0,6)}")

    val num1 = 26
    val num2 = 5

    val result = num1.rem(num2)
    println("$result")

    val res = mul(2,3)
    println(res)

}

fun mul(a:Int,b:Int): Int{
    return a*b
}