package basic_kotlin

fun main() {
//break with while
    println("Do-While Loop")
    println()
    var num1 = 4

    outer@ while (num1 > 0 ){
        var num2 = 4
        inner@ while (num2 > 0){

            if (num1==2)
                break@outer
                println("num1 = ${num1},num2 = ${num2}")
                num2--
            }
            num1--

        }

    // Break with Do-While Loop
    println("Do-While Loop")
    println()
    var num3 = 4

    outer@ do {
        var num4 = 4

        inner@ do {
            if (num3 == 1)
                break@outer
                println("num1 = ${num3},num2 = ${num4}")
            num4--
        } while (num4 > 0)
            num3--
    } while (num3 > 0)

//Break with for loop

    outer@ for (num5 in 4 downTo 1){

        inner@for (num6 in 4 downTo 1){
            if (num5==2)
                break@outer
            println("num1 = ${num5},num2 = ${num6}")
        }
    }



    }

