fun main() {
    var i = 1

    while (true){
        println("iterator ke $i")
        i++
        if (i > 20){
            break
        }
    }

    for (i in 1..20){

        if (i % 2 ==0){
            continue
        }
        println("iterator ke $i")
    }
}