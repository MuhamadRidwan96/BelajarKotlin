package collections

fun main() {
    /*IMMUTABLE*/
    //An example for immutable list
    val immutableList = listOf("Muhamad","Ridwan","Ramdani")
    for (index in immutableList){
        println(index)
    }
    println()
    //An example for immutable set
    val immutableSet = setOf(6,9,9,0,0,"Mahipal","Nikhil")
    for (values in immutableSet){
        println(values)
    }
    println()
    //An example for immutable map
    val immutableMap = mapOf(9 to "Mahipal",8 to "Nikhil",7 to "Rahul")
    for (key in immutableMap.keys){
        println(immutableMap[key])
    }
    println()
    /*MUTABLE*/
    //An example for mutable listOf
    var mutableList = mutableListOf("Muhamad","Ridwan","Ramdani")
    //modify element
    mutableList[0]="el-gio"
    //add one more element in the list
    mutableList.add("narendra")
    for (item in mutableList){
        println(item)
    }
    println()
    //An example for mutable setOf
    var mutableSet = mutableSetOf(6,10)
    //add one more element in the list
        mutableSet.add(2)
        mutableSet.add(5)
    for (items in mutableSet){
        println(items)
    }
    println()
    //An example for mutable mapOf
    var mutableMap = mutableMapOf(1 to "Mahipal",2 to "Nikhil",3 to "Rahul")
    //modify element
    mutableMap.put(1,"Faza")
    //add one more element in the map
    mutableMap.put(4,"Sahilla")
    for(values1 in mutableMap){
        println(values1)
    }
    println()
}