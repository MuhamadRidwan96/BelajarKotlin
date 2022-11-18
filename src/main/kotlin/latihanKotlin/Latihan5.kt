package latihanKotlin

fun main() {
    println(arr1(0))
    println(arr2())
    println(arr3())
}

fun arr2(){
    val arr = arrayOf("earth","mars","moon","jupiter","saturn")
    var i = 0
    while (i <= arr.size){
        println("the name of planet "+ arr[i])
        if (arr[i]=="jupiter")
            break
        i++
    }
}

fun arr3(){
    val arr = arrayOf("earth","mars","moon","jupiter","saturn")
    var i = 0

    do {
        println("the name of planet "+ arr[i])
        if (arr[i]=="mars") {
            break
        }
        i++
    }while (i <= arr.size)
}

fun arr1(i:Int):String{
    val arr = arrayOf("earth","mars","moon","jupiter","saturn")

    for (i in arr.indices){
        if (arr[i]=="mars") {
            break
        }
    }
    return "the name of planet "+ arr[i]
}

