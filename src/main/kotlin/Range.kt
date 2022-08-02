fun main() {
    //val range = 1..100
    val range = 100 downTo 1 step 5

    println(range.count())
    println(range.contains(30))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
    /*
    *Range operation
    * count == Get totals range data
    * contains(value) == Check had a values
    * first == get first value
    * last == get last values
    * step == get a value every increased*/


}