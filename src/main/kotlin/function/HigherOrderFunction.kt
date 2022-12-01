package function

//return type(int)
//declaration lambda
var lambdas = {a:Int,b:Int->a+b}
//declaration higher order function
fun high(lmbd:(Int,Int)->Int){
    //
    val result1=lmbd(4,5)
    println("the result is $result1")
}
//return unit(string)
fun example(s:String){
    println(s)
}

fun highODF(ex:String,example:(String)->Unit){
    example(ex)
}
//REGULAR FUNCTION DEFINITION
fun example2(a:Int,b:Int):Int{
    val sum = a+b
    return sum
}

fun highODF2(example2:(Int,Int)->Int){
    val result2 = example2(2,7)
    println("result is $result2")
}

//Returning a function from Higher-Order function
// function declaration
fun mul(a:Int,b:Int):Int{
   return a*b
}
//higher-order function declaration
fun highODF3():((Int,Int)->Int){
    return ::mul
}


fun main() {
    high(lambdas)
    highODF("bcdedit",::example)
    highODF2(::example2)
    //invoke function and store the returned function into a variable
    val multiply = highODF3()
    //// invokes the mul() function by passing arguments
    val result = multiply(4,5)
    println("the result is : $result")
}