package function
 /*   val upper = fun (value:String):String{
        return if (value ==""){
            "UPS"
        } else {
            value.toUpperCase()
        }
    }
*/
//    println(hello("eko",upper))
//    println(hello("",upper))
//
//    println(hello("dani",fun (value:String):String{
//        return value.toLowerCase()
//    }))


    val find = fun(index:Int):String{
        return if(index % 2 == 0 && index < 0){
            "index is even and negative"
        } else if (index % 2 == 0 && index > 0){
            "index is even and positive"
        } else if (index % 2 != 0 && index < 0){
            "index is odd and negative"
        } else {
            "index is odd and positive"
        }
    }
    //anonymous function with body as expression
    val anonymous1 = fun(a:Int,b:Int):Int= a + b
    //anonymous function with body as a block
    val anonymous2 = fun(c: Int, d: Int): Int {
        return c * d
    }


    fun main() {
        /*fun hello(name:String, transformer:(String)->String): String{
            val nameTransformer = transformer(name)
            return "Hello $nameTransformer"
        }*/
        val sum = anonymous1(2,3)
        val mul = anonymous2(3,4)
        println("the sum of two number is $sum")
        println("the multiple of two number is $mul")
        val result = find(122)
        println(result)
}