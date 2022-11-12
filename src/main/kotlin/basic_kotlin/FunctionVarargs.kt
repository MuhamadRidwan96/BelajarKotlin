

fun sumTotal(name: String ="aaron",vararg values: Int): Int{
    var total = 0
    for (value in values){
        total += value
    }
    println(name)
    return total
}

fun main() {

    val result = sumTotal("dani",10)
    println(result)
}