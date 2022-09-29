package basic_kotlin

//make pyramid
fun main() {
    val rows = 5
    var k = 0
    val list = listOf("brian","adam","john")
    list.forEachIndexed { i, name ->
        println("$i:$name")
    }

    for (i in 1..rows){
        for (space in 1..rows -i){
                print("  ")
            }
        while (k != 2 * i -1){ //mencari angka ganjil
            print("$i ")
            ++k
        }
        println()
        k = 0
    }
}