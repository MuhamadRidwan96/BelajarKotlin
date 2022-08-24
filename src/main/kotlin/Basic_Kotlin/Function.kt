fun helloWorld(){
    println("Hello World")
    println("Semangat Belajar Kotlin")
}

fun additional(a:Int,b:Int){
    println(a+b)
}

/*Function Parameters*/
fun sayHello(firstName:String, lastName: String?){
    if (lastName==null){
        println("hello $firstName")
    } else {
        println("hello $firstName $lastName")
    }

}
/*Function Default Argument*/
fun hello(firstName: String,lastName: String?=null){
    if (lastName == null){
        println("hello $firstName")
    } else {
        println("hello $firstName $lastName")
    }
}
/*Function Named Argument*/
fun fullName(firstName: String, midleName:String, lastName: String){
    println("hello $firstName $midleName $lastName")
}

/*Unit Returning function*/
fun unit(){
    println("hello")
}
/*Returning type*/
fun sum(a: Int, b: Int): Int {

    val hasil = a +b
    return hasil
}

fun div(a:Int, b: Int): Int{
    return if(b==0){
        0
    } else{
        val res = a/b
        res
    }
}

/*Single expression function*/
fun double(a:Int):Int = a*2



fun main() {
    helloWorld()
    additional(2,5)
    sayHello("Ridwan",null)
    sayHello("Eko","Foxtrot")
    hello("Dwi")
    hello("Dwi","Gun")
    fullName(
        lastName = "Ramdani",
        firstName = "Muhamad",
        midleName = "Ridwan"
    )
    val res = sum(10,9)
    println(res)

    val res2 = div(9,3)
    println(res2)

    val res3  = div(4,0)
    println(res3)

    println(double(3))

}

