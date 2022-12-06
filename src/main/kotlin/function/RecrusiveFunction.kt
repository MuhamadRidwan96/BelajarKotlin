package function

fun main() {

    //recursive function
    fun recursive(value : Int): Int{
         return when(value){
             1->1
             else->value*recursive(value-1)
         }
    }
//tail recursive function
    tailrec fun factorial(value : Long, total : Long=1): Long{
        return when(value){
            1L->total
            else -> factorial(value -1,total * value)
        }
    }

   println(recursive(5))
    println(factorial(25))
}