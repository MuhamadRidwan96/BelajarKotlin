package Data

open class Shape {
    open val corner = 1
}
class Rectangle : Shape(){
    override val corner = 2
}
class Oval : Shape(){
    override val corner = 3
}