fun main() {
    val names : Array<String> = arrayOf("John","Edie","Sean")
    println(names.size)
    println(names[1])
    println(names[1])
    names[1] = "Bryant"
    println(names[1])
    names[1] = "Arjun"
    println(names[1])

    val members : Array<String?> = arrayOfNulls(3)
    members[0] = "John"
    members[1] = "Leon"
    members[2] = "Dwi"

    println(members[0])


}