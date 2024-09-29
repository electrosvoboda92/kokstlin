package com.ivan.org.kotlincourse

fun main() {
    println("Hello World! mtf")
    val sum = "5" + "5"
    val diff = 10 - 5
    val product = 10 * 3
    val quatient = 8 / 2
    val remainder = 9 / 2
    val isEqual = 5 == 4
    val isNotEqual = (5 != 5)
    val isGreater = (5 > 3)
    val isLesser = (5 < 8)
    val isGreaterOrEquel = (5 >= 0)
    val isLesserOrEquel = ( 5 <= 5)
    val andResul= false && false
    val orResult = true || false
    val notResult = !(5 > 3)
    var numder = 5
    numder += 3
    numder -= 2

     val wtf = (5 % 2 != 1)

    println(wtf)


    printVolume(null)
}

fun printVolume(userVolume: Int?){
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}