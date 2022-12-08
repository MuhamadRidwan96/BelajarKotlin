package collections

fun main() {
    val names = listOf("Muhamad","El-gio","Narendra","Faza","Sahilla")
    //method 1
    for (name in names){
        print("$name, ")
    }
    println()
    //method 2
    for (i in names.indices){
        print(names[i])
    }
    println()
    //method 3
    names.forEachIndexed { i, j -> println("names[$i] = $j") }
    println()
    //method 4
    val it: ListIterator<String> = names.listIterator()
    while (it.hasNext()) {
        val i = it.next()
        print("$i ")
    }
}