package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("dani")
    manager.sayHello("budi")

    val vice = VicePresident("Ridwan")
    vice.sayHello("andi")
}