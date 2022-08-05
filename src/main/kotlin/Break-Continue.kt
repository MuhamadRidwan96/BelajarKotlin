fun main() {
    var i = 1

    while (true){
        println("iterator ke $i")
        i++
        if (i > 100){
            break
        }
    }

    for (i in 1..100){

        if (i % 2 ==0){
            continue
        }
        println("iterator ke $i")
    }
}