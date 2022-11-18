package timecomplexity

fun main() {
    val numbers = listOf(1,3,5,9,10)
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
    //space complexity
    fun printSorted(numbers:List<Int>){
        val sorted = numbers.sorted()
        for (element in sorted){
            println(element)
        }
    }

    //space complexity with small memory
    fun printSorteds(numbers: List<Int>) {
        // 1
        if (numbers.isEmpty()) return
        // 2
        var currentCount = 0
        var minValue = Int.MIN_VALUE
        // 3
        for (value in numbers) {
            if (value == minValue) {
                println(value)
                currentCount += 1
            }
        }
        while (currentCount < numbers.size) {
            // 4
            var currentValue = numbers.maxOrNull()!!
            for (value in numbers) {
                if (value in (minValue + 1) until currentValue) {
                    currentValue = value
                }
            }
            // 5
            for (value in numbers) {
                if (value == currentValue) {
                    println(value)
                    currentCount += 1
                }
            }
            //6
            minValue = currentValue
        }
    }

    println(linearContain(120,numbers))
    println(pseudoBinaryContains(120,numbers))
    println(printSorted(numbers))
    println(printSorteds(numbers))
}
/** space complexity with small memory **/
/*
Here’s what this algorithm is doing:
1. Check for the case if the list is empty. If it is, there’s nothing to print.
2. currentCount keeps track of the number of print statements made. minValue
stores the last printed value.
3. The algorithm begins by printing all values matching the minValue and updates
the currentCount according to the number of print statements made.
4. Using the while loop, the algorithm finds the lowest value bigger than minValue
and stores it in currentValue .
5. The algorithm then prints all values of currentValue inside the array while
updating currentCount .
6. minValue is set to currentValue , so the next iteration will try to function.getFind the next
minimum value.
*/