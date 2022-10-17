fun main() {
    /*Operation &&
    *  true && true == true
    *  true && false == false
    *  false && true == false
    *  false && false == false
    * */

    /*Operation ||
    *  true || true == true
    *  true || false == true
    *  false || true == true
    *  false || false == false
    * */

    if (true is Boolean){
        println("yes,true is boolean value")
    }

    val finalExam = 50
    val attendant = 75

    val passFinalExam = finalExam >= 80
    val passAttendant = attendant >= 75

    val arePass = passFinalExam && passAttendant
    println(arePass)
}