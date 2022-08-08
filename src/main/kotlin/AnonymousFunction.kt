fun main() {
    fun hello(name:String, transformer:(String)->String): String{
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }

    val upper = fun (value:String):String{
        if (value ==""){
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("eko",upper))
    println(hello("",upper))

    println(hello("dani",fun (value:String):String{
        return value.toLowerCase()
    }))
}