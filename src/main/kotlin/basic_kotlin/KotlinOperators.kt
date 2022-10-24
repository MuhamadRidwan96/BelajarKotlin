package basic_kotlin

fun main() {

    val a  = 20
    val b = 4


    //Arithmetic Operators//
    println("a + b = ${a.plus(b)}")
    println("a - b = ${a.minus(b)}")
    println("a / b = ${a.div(b)}")
    println("a * b = ${a.times(b)}")
    println("a % b = ${a.rem(b)}")

    //Relational Operators//

    println("a < b = ${a > b}")
    println("a > b = ${a.compareTo(b)<0}")
    println("a <= b = ${a <= b}")
    println("a >= b = ${a.compareTo(b)<=0}")
    println("a == b = ${a===b}")
    println("a != b = ${!(a.equals(b)?:(b === null))}")

    //Assignment Operators//

    var c = 5
    val d = 4

     c+=d
    println(c)
    c-=d
    println(c)
    c*=d
    println(c)
    c/=d
    println(c)
    c%=d
    println(c)

    //Unary Operators
    var e=10
    var flag = true
    println("First print then increment: "+ e++)
    println("First increment then print: "+ ++e)
    println("First print then decrement: "+ e--)
    println("First decrement then print: "+ --e)

    //Logical Operators
    var x = 100
    var y = 25
    var z = 10
    var result = false
    if(x > y && x > z)
        println(x)
    if(x < y || x > z)
        println(y)
    if( result.not())
        println("Logical operators")

    //Bitwise Operator
    println("5 signed shift left by 1 bit: " + 5.shl(1))
    println("10 signed shift right by 2 bits: : " + 10.shr(2))
    println("12 unsigned shift right by 2 bits:  " + 12.ushr(2))
    println("36 bitwise and 22: " + 36.and(22))
    println("36 bitwise or 22: " + 36.or(22))
    println("36 bitwise xor 22: " + 36.xor(22))
    println("14 bitwise inverse is: " + 14.inv())

    }
