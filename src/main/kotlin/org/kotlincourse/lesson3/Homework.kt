package org.kotlincourse.lesson3

val baza: Int = 1

val barak: String = "Obama"

var solder: String = "green"

lateinit var count: String

var lopata: Int = 0
    get() = field
    set(value){
        if (value >= 0) field = value
        else field = 300
    }

val agree: Boolean = true

val numbers: Array<Int> = arrayOf(1, 2, 3)
val strings: MutableList<String> = mutableListOf("he", "heh", "hehe")
val doubles: Set<Double> = setOf(23.3, 56.9)

val keysToValues: Map<String, String> = mapOf(
    "Key 1" to "Importance 1",
    "Key 2" to "Importance 2",
)

