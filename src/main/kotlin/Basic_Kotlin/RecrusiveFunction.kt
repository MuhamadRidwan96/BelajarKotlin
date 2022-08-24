package Basic_Kotlin

fun main() {
    fun recrusive(value : Int): Int{
         return when(value){
             1->1
             else->value*recrusive(value-1)
         }
    }

    tailrec fun factorial(value : Long, total : Long=1): Long{
        return when(value){
            1L->total
            else -> factorial(value -1,total * value)
        }
    }

   println(recrusive(5))
    println(factorial(25))
}