    package latihanKotlin

fun main() {
    println(unlabelledWithFor(0))
    println()
    println(unlabelledWithWhile())
    println()
    println(unlabelledWihtDoWhile())
    println()
    println(labelledWithFor())
    println()
    println(labelledWithWhile())
    println()
    println(labelledWithDoWhile())
}

fun unlabelledWithWhile(){
    val arr = arrayOf("earth","mars","moon","jupiter","saturn")
    var i = 0
    while (i <= arr.size){
        println("the name of $i is the planet "+ arr[i])
        if (arr[i]=="jupiter")
            break
        i++
    }
}

fun unlabelledWihtDoWhile(){
    val arr = arrayOf("earth","mars","moon","jupiter","saturn")
    var i = 0

    do {
        println("the name of $i is the planet "+ arr[i])
        if (arr[i]=="mars") {
            break
        }
        i++
    }while (i <= arr.size)
}

fun unlabelledWithFor(i:Int):String{
    val arr = arrayOf("earth","mars","moon","jupiter","saturn")

    for (i in arr.indices){
        if (arr[i]=="mars") {
            break
        }
    }
    return "the name of $i is the planet "+ arr[i]
}
    fun labelledWithFor(){
      outer2@for(i in 4 downTo 1){
          inner@for(j in 1..i){
              if (i == 2)
                  break@outer2
              println("variable $i and $j")
          }
      }

    }
    fun labelledWithWhile(){
        val arr = arrayOf("earth","mars","moon","jupiter","saturn")
    }

    fun labelledWithDoWhile(){
        val arr = arrayOf("earth","mars","moon","jupiter","saturn")
    }