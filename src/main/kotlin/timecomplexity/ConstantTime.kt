package app

fun main() {
    //constant time with null
    val name = listOf(null, "eko", "dodi")
    val type = listOf("standard", "premium", "executive")
    fun checkFirs(name: List<String?>){
        if (name.firstOrNull() != null) {
            println(name.first())
        } else {
            println("no name required")
        }
    }

    fun checkFirst(type: List<String>) {
        if (type.firstOrNull() != null) {
            println(type.first())
        } else {
            println("No Required type")
        }
    }

    println(checkFirs(name))
    println(checkFirst(type))
}
