package org.kotlincourse.lesson9

fun main() {


    val numbers = arrayOf<Int>()

    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 2.3)

    val emptyArray = Array(5) { 1 }
    val emptyNullableArray: Array<Int?> = arrayOfNulls(5)

    val readOnlyList: List<Any> = listOf(1, "b", "c")
    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")

    val numberSet: Set<Int> = setOf(1, 2, 3, 4, 5, 5)

    val mutableNumbersSet: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    mutableList.add("ui")
    val set = setOf("K", "o", "t", "l", "i", "i", "n")

    for (letter in set) {
        println("| $letter |")
    }

    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[1])
        }
    }

    var index = list.lastIndex
    while (index >= 0) {
        println("'${list[index--]}'")
    }

    val justNumbers: Array<Int> = Array(100) { 0 }
    val ardoubleArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)

    val testArray = Array(10) { 0 }
    testArray[0] = 10
    for (index in testArray.indices) {
        testArray[index] = (index + 1) * 10

    }
    println(testArray.toList())

    val smthArray = arrayOf("Hey", "You", "Come", "Here", "Bastard")
    for (i in smthArray.indices) {
        smthArray[i] = " "
    }
    println(smthArray.toList())

    val testArray2 = arrayOf(2, 3, 4)
    val testArray3 = arrayOf(5, 6, 7)

    val newArray = Array(3) { 0 }
    for (i in newArray.indices) {
        newArray[i] = testArray2[i] + testArray3[i]
    }
    println(newArray.toList())


    val list1 = listOf<Int>()


    val listFloat: MutableList<Float> = mutableListOf()

    listFloat.add(0, 45F)
    listFloat.add(1, 10F)
    listFloat.remove(45F)
    listFloat.removeAt(0)

    println(listFloat)


    val list2 = listOf("Hu", "Piz", "Gi")
    for (i in list2) {
        println(i)
    }

    val emptySet = setOf<Int>()
    val setNum = setOf(1, 2, 3, 4, 5)
    val setNum1 = mutableListOf(1, 2, 3)
    setNum1.add(6)
    setNum1.remove(2)
    println(setNum1)

    for (i in setNum1) {
        println(i * i)
    }

    fun findNumber(setNumbers: Set<Int>, number: Int): Boolean {
        for (elem in setNumbers) {
            if (elem == number) {
                return true
            }
        }
        return false
    }

    val set1 = setOf(1, 2, 3)
    val set2 = setOf(5, 6, 7)
    val emptySet2 = mutableSetOf<Int>()

    for (element in set1) {
        emptySet2.add(element)
    }
    for (element in set2) {
        emptySet2.add(element)
    }

    println(emptySet2)
}