
fun String.hello():String = "Hello $this"

fun String.hy():Unit = println("Hello $this")

fun main() {
    val name = "eko"
    println(name.hello())

    name.hy()

    "Muhamad".hy()
}