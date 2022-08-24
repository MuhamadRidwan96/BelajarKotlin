package App

import Data.Manager
import Data.VicePresident

fun main() {
    val manager = Manager("dani")
    manager.sayHello("budi")

    val vice = VicePresident("Ridwan")
    vice.sayHello("andi")
}