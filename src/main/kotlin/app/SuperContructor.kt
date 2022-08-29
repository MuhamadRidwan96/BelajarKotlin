package app

import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Dani",100000)
    println(premiumCustomer.name)
    println(premiumCustomer.balance)
    println(premiumCustomer.type)
}