package basic_kotlin

fun main() {
    var num = 1

    //while loop
    while (num <=30){
        if (num % 3 == 0 && num % 5 ==0){
            println("fizz buzz")
            num++
            continue
        } else if (num % 5 ==0) {
            println("buzz")
            num++
            continue
        } else if (num %3 == 0){
            println("fizz")
            num++
            continue
        }
        println(num)
        num++
    }

    //do while loop
    var value = 1

    do {
        if (value <= 5 || value >= 15){
            value++
            continue
        }
        println("$value")
        value++
    }while (value <= 20)

    // For loop

   val planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")
    for (i in planets.indices){
        if (i < 3)
            continue
        println(planets[i])
    }

}