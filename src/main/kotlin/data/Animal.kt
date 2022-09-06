package data

abstract class Animal {

    abstract val name:String
    abstract fun run()
}

class Cat:Animal(){
    override val name:String = "kucing"
    override fun run() {
        println("$name berlari")
    }
}