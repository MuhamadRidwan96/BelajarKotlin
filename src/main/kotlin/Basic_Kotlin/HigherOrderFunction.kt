package Basic_Kotlin
fun main() {
    fun hello(name:String, transformer:(String)->String): String{
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }
    val lambdaUpper = {value:String-> value.toUpperCase()}
    println(hello("eko",lambdaUpper))
    //trailing lambda
    println(hello("eko") { value: String -> value.toLowerCase() })
}