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

    //fibonacci

    val n = 10
    var t1 = 0
    var t2 = 1

    print("first $n : ")
    for (i in 1..n){
        print("$t1 + ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }

    for(ranges in 100 downTo 1 step 15){
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

}