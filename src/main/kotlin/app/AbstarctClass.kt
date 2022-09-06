package app

import data.Location


fun main() {
    val city = Location.City("subang")
    val country = Location.Country("Bandung")
    println(city.name)
    println(country.name)
}