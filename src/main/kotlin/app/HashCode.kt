package app

import data.Company

fun main() {

    val company1 = Company("DP")
    val company2 = Company("DP")

    println(company1.hashCode()==company2.hashCode())
    println(company1)
    println(company2)
}