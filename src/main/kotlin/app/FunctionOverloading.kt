package app

import data.Persons

fun main() {
    val dani = Persons()
    dani.firstName = "Dani"

    dani.sayHello("andi")
    dani.sayHello("dodo","dodi")
}