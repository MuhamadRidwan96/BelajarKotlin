package app

import data.Handphone
import data.Laptop
import data.SmartWatch

fun printObject(any: Any){
    if (any is Laptop){
        println("Laptop with name ${any.name}")
    } else if (any is Handphone){
        println("Laptop with name ${any.name}")
    } else{
        println(any)
    }

}

fun printObjectWithWhen(any: Any){
  when(any){
      is Laptop -> println("Laptop with name ${any.name}")
      is Handphone->println("HandPhone with name ${any.name}")
      else -> println(any)
  }
}

fun printString(any: Any){
    val value:String = any as String
    println(value)
}

fun printStringSafe(any: Any){
    val value:String? = any as? String
    println(value)
}
fun main() {
    printString("EKO")
    printStringSafe(1)
    printObject("eko")
    printObject(1)
    printObject(Laptop("acer"))
    printObject(SmartWatch("samsung","android"))
    printObjectWithWhen(Laptop("acer"))
}