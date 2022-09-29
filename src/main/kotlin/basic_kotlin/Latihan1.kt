package basic_kotlin

fun main() {
    val rows = 5
    var row = 2
    var three = 3
    var added = ++three + three++
    val test = ++row + row++
    var next = added++
    val last = 'E'
    var alphabet = 'A'

    for (i in 1..rows) {
        for (j in 1..rows-i) {
            print("* ")
        }
        println()
    }


    for(y in rows downTo 1){
        for(x in 1 ..y){
            print("$x ")
        }
        println()

    }

    for(a in last - 'A'+1 downTo 1){
        for (b in 1..a){
            print("$alphabet ")
        }
        ++alphabet

        println()
    }

    for(c in 1..last - 'A'+1){
        for (d in c downTo 1){
            print("$alphabet ")
        }
        ++alphabet
        println()
    }




    println(three)
    println(added)
    println(test)
    println(++next)
}