fun main() {
    var i = 1

    while (true){
        println("iterator ke $i")
        i++
        if (i > 20){
            break
        }
    }

    for (i in 1..20){

        if (i % 2 ==0){
            continue
        }
        println("iterator ke $i")
    }

    val planet = arrayOf("earth","mars","venus","jupiter")
    var y = 0

    do{
        println("the name of $y th planet : ${planet[y]}")
        if (planet[y] == "venus"){
            break
        }
        ++y
    }while (y<=planet.size)

    var x =0
    while (x <= planet.size){
        println(planet[x])
        if (x == planet.size -2){
            break
        }
        x++
    }
 }