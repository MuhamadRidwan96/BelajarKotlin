package app

import data.Human

fun main() {
    val human = Human("Ridwan")
    human.sayHello("Dani")
    //multiple interface
    human.go()
    //concrete interface
    val human1 = Human.Human1("Muhamad")
    human1.sayHello("Dinda")
    human1.move()
}
