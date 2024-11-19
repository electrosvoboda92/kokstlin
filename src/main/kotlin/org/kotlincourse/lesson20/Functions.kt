package org.kotlincourse.lesson20


fun String.removeSpaces(): String {
    return replace(" ", "")
}

fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}

fun String.funA(arg1: String, arg2: Int): Boolean {
    return true
}

fun List<Int>.funB(arg1: String?) {

}

fun <KEY, VAL> Map<KEY, VAL>.funC(arg1: KEY, arg2: VAL): Boolean {
    return true
}

fun Double?.funD(arg1: Double, arg2: String?): Double {
    return 0.0
}

fun <T> Set<T>.funE(arg: T): List<T> {
    return listOf()
}




fun main() {
    val result = "String with spaces".removeSpaces()
    println(result)
    val s: List<Int?> = listOf(1, null)
    s.isElementsNullOrEmpty()


}