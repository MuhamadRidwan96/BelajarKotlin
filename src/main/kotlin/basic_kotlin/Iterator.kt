package basic_kotlin

fun main() {
    val names = arrayOf("Muhamad","Rdn","ram")
    val fruits = listOf("banana","pear","apel")
    for (name in names){
        println(name)
    }

    for (fruit in fruits.indices){
        println("item as $fruit is ${fruits[fruit]}")
    }

    val range = 1..100
    for (ranges in range){
        println(ranges)
    }

    for(ranges in 100 downTo 1 step 5){
        println(ranges)
    }

    val sizeOfArray = names.size -1
    for (i in 0..sizeOfArray){
        println("index $i = ${names.get(i)}")
    }
    var ind = 0
    while(ind < fruits.size){
        println("item $ind is ${fruits[ind]}")
    ++ind
    }
    var indx = 0
    while(indx < names.size){
        println(names)
        ++indx
    }

}