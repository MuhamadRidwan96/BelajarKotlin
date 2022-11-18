package function
    //with type annotation in lambda expression
    val sum5 = {a:Int,b:Int ->
    val num = a + b
    num.toString()}//convert int to string

    //without type annotation in lambda expression
    val sum6:(Int,Int)->Int = {a,b->a+b}

    //lambda used as extension class
    val lambda:String.(Int)->String = {this+it}

    //it: implicit name of single parameter
    val num = arrayOf(1,-2,3,-4,5)

fun main() {
    //lambda function with multiple parameter
    val exLambda:(String,String) -> String = {firstname , lastname ->
        val result = "$firstname $lastname"
        val result1 = sum5(5,6)
        val result2 =sum6(5,5)
        val result3 = "Geeks".lambda(50)
        println(num.filter { it > 0 }) //it as implicit name of single parameter
        println(num.filter { item ->item >0 }) //using longhand form of lambda function
        println("result from lambda expression is $result1")
        println("result from lambda expression is $result2")
        println("result from lambda expression is $result3")

        result
    }

    fun toUpper(value:String):String = value.toUpperCase()
    val result = exLambda("eko","kurniawan")
    println(result)
    //lambda function with one parameter
    val sayHello:(String) ->String={ "hello $it" }
    println(sayHello("Dani"))

    //lambda function with method references
    val lambdaName:(String)->String = ::toUpper
    println(lambdaName("Dani Muhamad"))
}