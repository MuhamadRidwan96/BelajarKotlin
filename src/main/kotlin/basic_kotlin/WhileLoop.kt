package basic_kotlin

fun main() {
    val array = arrayOf("india","indonesia","malaysia","singapore","brunei","papua")
    var element = 0
    var index = 1
    while (element < array.size) {
     println(array[element])
        element++
    }

    while (index <= 10){
        if (index == 10){
            print(0)
        } else {
            print(index)
        }
        ++index
    }

    //fibonacci with while loop

    val x = 10
    var t3 = 0
    var t4 = 1
    var j = 1


    while (j <= x){
        print("$t3 + ")

        val add = t3 + t4
        t3 = t4
        t4 = add
        j++
    }
}