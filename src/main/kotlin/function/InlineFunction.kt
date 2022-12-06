package function
 inline fun higherFunction(str:String,myCall:(String) ->Unit){
    myCall(str)
}

inline fun returnLambda(lambda1:()->Unit,lambda2:()->Unit){
    lambda1()
    lambda2()
}

/*var lambda3 = { println("lambdas expression")
                return}*/ //return not allowed here
//inline properties
fun foo(i: Int): Int {
    return i
}
inline var flag:Boolean
    get() = foo(10)==10
    set(flag){flag}
/*##################*/

fun main() {
    println(flag)
    print("geeksOfGeeks : ")
    higherFunction("This new stuff!",::print)
    println()
    println("Main Function Start")
    returnLambda({ println("Lambda 1 ")
    return},//inline function allow return
            //statement in lambda expression
            //so, does not give compile time error
        { println("Lambda 2") })
    println("Main Function End")
}