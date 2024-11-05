package org.kotlincourse.lesson16

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}

fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${Colors.RESET}")
}


abstract class MusicalInstrument {

    open fun playNote(note: String) {
        println("MKALKMvlkm")
    }

    protected fun shortNote(note: String, color: String) {
        printColored("Play short note $note", color)
    }

    protected fun longNote(note: String, color: String) {
        printColored("Play long note $note", color)
    }
}

class Cello : MusicalInstrument() {
    override fun playNote(note: String) {
        longNote(note, Colors.GREEN)
    }
}

class Piano : MusicalInstrument() {
    override fun playNote(note: String) {
        shortNote(note, Colors.CYAN)
    }
}

class Flute : MusicalInstrument() {
    override fun playNote(note: String) {
        shortNote(note, Colors.YELLOW)
    }
}

class Calc() {
    fun sum(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    fun sum(number1: Double, number2: Double): Double {
        return number1 + number2
    }

    fun sum(number1: String, number2: String): String{
        return number1 + number2
    }

    fun sum(number1: List<Int>, number2: List<Int>): List<Int>{
        return number1 + number2
    }

    fun sum(a: String, b: Boolean): String{
        return a + b.toString()
    }
}

fun main() {
    Cello().playNote("Do")
    Piano().playNote("La")
    Flute().playNote("Re")

    val orchectra = listOf(
        Cello(),
        Piano(),
        Flute()
    )
    orchectra[1].playNote("B")
    orchectra.forEach { it.playNote("Do") }

    val calculator = Calc()
    println(calculator.sum("1 ", true))
    println(calculator.sum(2, 3))
    println(calculator.sum(3.4, 5.1))
    println(calculator.sum("2", "9"))
    println(calculator.sum(listOf(1,2), listOf(9,4)))

    val num = 10
    num.toString()

}