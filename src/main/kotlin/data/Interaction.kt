package data

interface Interaction {

    val name:String
    fun sayHello(name:String)     {
        println("Hello $name, My name is ${this.name}")
    }
}
//multiple interface
interface Go : Interaction{
    fun go()    {
        println("GO!")
    }
}

interface MoveA{
    fun move() = println("move a")
}

interface  MoveB{
    fun move()   = println("move b")
}
class Human(override val name: String) : Go{
    override fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }

class Human1(override val name:String) :Go,MoveA,MoveB{
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}


}