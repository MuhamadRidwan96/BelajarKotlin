
package basic_kotlin

fun main() {
    fun hello(name:String=""):String {
        return if (name == "") {
            "Hello Bro!"
        } else {
            "Hello $name"
        }

    }
    fun hello1(name:String =""):String{
    return when(name){
        "" -> "hello bro!"
        else -> "hello $name"
    }
}



    println(hello())
    println(hello("dani"))
    println(hello1("Ram"))
}