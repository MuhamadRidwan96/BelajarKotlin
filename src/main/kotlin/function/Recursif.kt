package function
//recursive with if condition
fun fact(a:Int):Long{
    return if(a==1) a.toLong()
    else a* fact(a-1)
}

//recursive with when condition
fun factorial(b:Int):Long{
    return when(b){
        1->1 
       else->b* factorial(b-1)
    }
}
fun sum(args:Array<Int>, index:Int):Int{
    return if (index <= 0) 0
    else (sum(args,index -1) + args[index-1])
}
fun mul(args1:Array<Int>,value:Int):Int{
    return if(value <= 1) 1
        else (mul(args1,value-1) * args1[value-1])

}


fun main() {
    println("factorial of 5 is : ${fact(3)}")
    println("factorial of 5 is : ${factorial(3)}")
    val arr = arrayOf(1,2,3,4,5,6,7,8,9)
    val arr2 = arrayOf(1,3,5)
    val n = arr.size
    val x = arr2.size
    val result = sum(arr,n)
    val result2 = mul(arr2,x)
    println("sum of array is : $result")
    println("multiple of array is : $result2")
 

    
}