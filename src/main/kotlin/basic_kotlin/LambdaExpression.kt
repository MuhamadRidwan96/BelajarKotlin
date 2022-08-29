package basic_kotlin

fun toUpper(value:String):String = value.toUpperCase()

fun main() {
    //lambda function with multiple parameter
    val exLambda:(String,String) -> String = {firstname , lastname ->
        val result = "$firstname $lastname"
        result
    }
    val result = exLambda("eko","kurniawan")
    println(result)

    //lambda function with one parameter
    val sayHello:(String) ->String={
        "hello $it"
    }
    println(sayHello("Dani"))

    //lambda function with method references
    val lambdaName:(String)->String = ::toUpper
    println(lambdaName("Dani Muhamad"))

    //Higher-order function

}