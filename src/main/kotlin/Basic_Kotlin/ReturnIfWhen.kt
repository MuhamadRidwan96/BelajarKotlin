package Basic_Kotlin

fun main() {
    fun Hello(name:String=""):String{
      /*  return if (name==""){
            "Hello Bro!"
        }else {
            "Hello $name"
        }*/

        return when(name){
            "" -> "hello bro!"
            else -> "hello $name"
        }
    }

    println(Hello())
    println(Hello("dani"))
}