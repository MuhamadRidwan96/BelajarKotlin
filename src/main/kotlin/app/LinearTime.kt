package app

fun main() {
    val names = listOf("dani","muhamad","musa")
    fun printNames(names:List<String>) {
        for (name in names){
            println(name)
        }
    }
 println(printNames(names))
}