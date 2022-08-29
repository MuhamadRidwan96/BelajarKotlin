package app

import data.Oval
import data.Rectangle
import data.Shape

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape2= Rectangle()
    println(shape2.corner)

    val shape3 = Oval()
    println(shape3.corner)


}