package app

import data.Persons

fun main() {
    val dani = Persons()

    dani.firstName = "Muhamad"
    dani.midleName = "Ridwan"
    dani.lastName = "Ramdani"

    dani.sayHello("andi")
    dani.run()
    val fullname = dani.getName()
    println(fullname)
}