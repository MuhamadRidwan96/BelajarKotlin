package app

fun main() {
    val numbers = listOf(1,3,5,9,10,22,25,28,60,70,90,105,120)
    fun linearContain(value:Int,numbers:List<Int>):Boolean{
        for (element in numbers){
            if (element==value){
                return true
            }
        }
        return false
    }

    fun pseudoBinaryContains(value:Int,numbers:List<Int>):Boolean{

        if (numbers.isEmpty()) return false
        val middleIndex = numbers.size/2
        if (value <= numbers[middleIndex]){
            for (index in 0..middleIndex){
                if (numbers[index]==value){
                    return true
                }
            }
        } else{
            for (index in middleIndex until numbers.size){
                if (numbers[index]==value){
                    return true
                }
            }
        }
    return false
    }

    println(linearContain(120,numbers))
    println(pseudoBinaryContains(120,numbers))
}