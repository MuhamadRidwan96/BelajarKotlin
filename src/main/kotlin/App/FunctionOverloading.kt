package App

import Data.Persons

fun main() {
    val dani = Persons()
    dani.firstName = "Dani"

    dani.sayHello("andi")
    dani.sayHello("dodo","dodi")
}