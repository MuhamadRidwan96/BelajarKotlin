package app

import data.Company

fun main() {

    val company1 = Company("DP")
    val company2 = Company("DP")

    //equals function
    println(company1==company2)
    //hasCode function
    println(company1.hashCode()==company2.hashCode())

}