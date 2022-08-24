fun main() {
    fun hello(name:String, transformer:(String)->String): String{
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }

    val upper = fun (value:String):String{
        return if (value ==""){
            "UPS"
        } else {
            value.toUpperCase()
        }
    }

    println(hello("eko",upper))
    println(hello("",upper))

    println(hello("dani",fun (value:String):String{
        return value.toLowerCase()
    }))

}