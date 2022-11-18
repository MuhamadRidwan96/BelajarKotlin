package function

fun sum3(args3:Array<Int>, value:Int):Int{
    return if (value <= 0) 0
    else (sum3(args3,value-1) + args3[value-1])
}

tailrec fun sum4(args4: Array<Int>, index:Int, s:Int=0):Int{
    return if (index <= 0) s else sum4(args4,index-1 ,s + args4[index-1])
    }

fun main() {
    val arrays = arrayOf(1,4,5)
    val arb = arrays.size
    val ars = arrays.size
    val res = sum3(arrays,arb)
    val result = sum4(arrays,ars)
    println("$result&&$res")
}