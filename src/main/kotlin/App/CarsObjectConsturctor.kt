package App

import Data.Cars

fun main() {
    val car = Cars("SUV","SUBARU")
    car.year = 2022

    val avanza = Cars("Coupe")
    println(avanza.type)
    println(car.type)
    println(car.brand)
    println(car.year)
}