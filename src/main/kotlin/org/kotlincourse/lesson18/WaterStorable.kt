package org.kotlincourse.lesson18

interface WaterStorable {
    val volume: Double
    fun fill(amount: Double)
    fun take(amount: Double)
}