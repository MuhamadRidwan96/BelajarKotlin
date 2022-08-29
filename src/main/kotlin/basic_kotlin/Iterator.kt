package basic_kotlin

fun main() {
    val names = arrayOf("Muhamad","Rdn","ram")
    for (name in names){
        println(name)
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
}