package data

class Persons {
    var firstName: String = ""
    var midleName: String? = null
    var lastName: String = ""

    fun sayHello(name:String){
        println("hello $name ,my name is $firstName")
    }
    fun sayHello(firstName:String,lastName:String){
        println("hello $firstName $lastName ,my name is ${this.firstName}")
    }

    fun run(){
        println("i'm run")
    }

    fun getName():String{
        return "$firstName,$midleName,$lastName"
    }
}