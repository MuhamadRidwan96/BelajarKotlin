package basic_kotlin

fun main() {
    var num1 = 4

    outer@ while (num1 > 0) {
        num1--
        var num2 = 4
        inner@ while (num2 > 0) {
            if (num1 <= 2)
                continue@outer
            println("num1 = $num1 num2 = $num2")
            num2--

        }
    }
//DO WHILE
    var num3 = 4
    outer@ do {
        num3--
        var num4 = 4
        inner@ do {
            if (num3 <= 2)
                continue@outer
            println("num3= $num3 num4 = $num4")
            num4--
        }while (num4 > 0)
    } while (num3 > 0)


//FOR iterator
    outer@ for (num5 in 4 downTo 1){
        inner@ for (num6 in 4 downTo 1) {
            if (num5 <= 3)
                continue@outer
            println("num5= $num5 num6 = $num6")
        }
    }

}