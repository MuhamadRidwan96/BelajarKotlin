package data

open class Shape {
    //use keyword "open" for make overriding
    open val corner: Int = -1

    open fun printName(){
        println("This is shape!")
    }
}
class Rectangle : Shape(){
    override val corner:Int = 2
    val parentCorner:Int = super.corner
    override fun printName(){
        println("this is rectangle")
        super.printName()
    }
}
class Oval : Shape(){
    override val corner: Int = 3
}