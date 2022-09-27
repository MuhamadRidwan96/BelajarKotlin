package timecomplexity

fun main() {
    //constant time with null
    val name = listOf(null, "eko", "dodi")
    val type = listOf("standard", "premium", "executive")
    val user = listOf("dani","dandi","dinda")
    fun checkFirs(name: List<String?>){
        if (name.firstOrNull() != null) {
            println(name.first())
        } else {
            println("no name required")
        }
    }

    fun checkFirst(type: List<String>) {
        if (type.firstOrNull() != null) {
            println(type.first())
        } else {
            println("No Required type")
        }
    }

    fun cekPertama(user:List<String>):List<String> {
        if (user.firstOrNull() != null) {
            println(user.first())
        } else {
            println("No required type")
        }
        return user
    }

    fun pertamaCek(type:List<String>){
        if (type.firstOrNull()!= null){
            println(type.first())
        } else{
            println("no required")
        }
    }

    println(checkFirs(name))
    println(checkFirst(type))
    println(cekPertama(user))
    println(pertamaCek(type))
}
