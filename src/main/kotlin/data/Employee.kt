package data
//class overloading multiple class
open class Employee(val names:String){
    //function overriding
    open fun sayHello(name: String){
        println("Hello $name, my name is ${this.names}")
    }
}
//inheritance
open class Manager(name: String) : Employee(name){
  final override fun sayHello(name: String){
        println("Hello $name, my name is Manager ${this.names}")
    }
}

class SuperManager(name: String) : Manager(name){
    //cannot override because function is final
//    override fun sayHello(name: String){
//        println("Hello $name, my name is Manager ${this.names}")
//    }
}

class VicePresident(name: String) : Employee(name){
    override fun sayHello(name: String){
        println("Hello $name, my name is Vice Manager ${this.names}")
    }
}
