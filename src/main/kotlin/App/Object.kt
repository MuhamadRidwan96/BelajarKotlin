package App

import Data.Persons

fun main() {
    val dani = Persons()
    dani.firstName = "MUHAMAD"

    val ridwan = Persons()
    ridwan.midleName = "RIDWAN"

    val ramdani = Persons()
    ramdani.lastName= "RAMDANI"


    println(dani.firstName)
    println(ridwan.midleName)
    println(ramdani.lastName)
}