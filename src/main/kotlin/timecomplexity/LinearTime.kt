package timecomplexity

fun main() {
    val names = listOf("dani","muhamad","musa")
    val nums = listOf(1,2,3,4,5,6,7,8,9,0)
    fun printNames(names:List<String>) {
        for (name in names){
            println(name)
        }
    }

   /* fun printNum(nums:List<Int>):Int{
        for (num in nums){
            print(num)
        }
        re
    }*/

 println(printNames(names))
}