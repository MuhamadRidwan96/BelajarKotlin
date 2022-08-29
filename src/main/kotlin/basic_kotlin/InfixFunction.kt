package basic_kotlin

infix fun String.to(type:String):String{
    if(type=="UP"){
        return this.toUpperCase()
    } else{
        return this.toLowerCase()
    }
}


fun main() {
    var res = "Muhamad Ridwan" to "Up"
    println(res)


}