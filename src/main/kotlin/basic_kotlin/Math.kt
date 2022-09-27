package basic_kotlin

fun main() {
    val result2: Double = 10.0 / 3.0
    val result3: Int = 2 + 3
    val result4: Int= 2 - 2
    val result5: Int = 2 * 2

    //function
    fun sum(a:Int,b:Int) :Int{
        return a + b
    }
    //function expression
    fun min(a:Int,b:Int)= a-b

    val sick = true

    println(!sick)
    println("the output is ${sum(2,4)}")
    println("the output function expression is ${min(5,2)}")
    println(result2)
    println(result3)
    println(result4)
    println(result5)
    val barang1 = 100
   // result3 += barang1

    val barang2 = 50
    //result3 *= bar
    // ang2

    val barang3 = 20
  //  result3 -= barang3

//    println(result3)
//   // result3++
//    println(result3)
//   // result3--
//    println(result3)

    /*
    Augmented Assignment
    * a = a + 10 <==> a += 10
    * a = a - 10 <==> a -= 10
    * a = a * 10 <==> a *= 10
    * a = a / 10 <==> a /= 10
    * a = a % 10 <==> a %= 10
    * */

    /*Unary Operator
    * ++ <==> a = a+1
    * -- <==> a = a-1
    * + == positive
    * - == negative
    * ! ==  reverse boolean
    * */
}