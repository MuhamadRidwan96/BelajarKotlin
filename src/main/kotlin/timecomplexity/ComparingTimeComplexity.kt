package timecomplexity

fun main() {
    fun compare(n : Int):Int{
        var result= 0
        for(i in 1..n){
            result += i
        }
        return result
    }

    //reduce
    fun compare1(n:Int):Int{
        return(1..n).reduce{sum,element->sum+element}
    }

    fun compare2(n:Int):Int{
        return n*(n+1)/2
    }
    println(compare(4))
    println(compare1(4))
    println(compare2(3))
}

