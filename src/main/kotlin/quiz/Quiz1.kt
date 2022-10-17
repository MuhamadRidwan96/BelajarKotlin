package quiz

open class Car {
    open val hp:Int = 100

   init {
       println("Created car with $hp HP")
   }
}

class Supercars : Car(){
    override val hp: Int = 200

}

fun main() {

    Car()
    Supercars()
}