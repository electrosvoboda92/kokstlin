package org.kotlincourse.lesson9

fun main() {
    //Array
    val hwArray1 = arrayOf(1, 2, 3, 4, 5)
    println("Task 1 on Array $hwArray1")

    val hwArray2 = Array(10) { }
    println("Task 2 on Array $hwArray2")

    val hwArray3: Array<Double> = Array(5) { 0.0 }
    for (index in hwArray3.indices) {
        hwArray3[index] = (index * index).toDouble()
        print(hwArray3[index])
        print(" ")
    }
    println("Task 3 on Array ${hwArray3.toList()}")

    val hwArray4 = arrayOf(1, 2, 3, 4, 5)
    for (index in hwArray4.indices) {
        hwArray4[index] = index * 3
        print(hwArray4[index])
        print(" ")
    }
    println("Task 4 on Array ${hwArray4.toList()}")

    val hwArray5 = arrayOfNulls<String>(2)
    println("Task 5 on Array ${hwArray5.toList()}")

    val hwArray6 = arrayOf(11, 12, 13, 14, 15)
    for (elem in hwArray6) {
        val newArray = arrayOf(elem)
        print(newArray.toList())
    }
    println("Task 6 on Array ${hwArray6.toList()}")

    val hwArray7 = arrayOf(10, 11, 12)
    val hw7Array = arrayOf(17, 19, 21)
    val newArray7 = Array(3) { 0 }

    for (i in hw7Array.indices) {
        newArray7[i] = hw7Array[i] - hwArray7[i]
    }
    println("Task 7 on Array ${newArray7.toList()}")

    val hwArray8 = arrayOf(2, 4, 5, 8, 11)
    var i = 10
    while (i > 5) {
        if (5 in hwArray8) {
            println(hwArray8.indexOf(5))
            break
        } else {
            i--
        }

    }
    println("Task 8 on Array")


    val hwArray9 = arrayOf(13, 14, 15, 67, 87, 98)
    for (elem in hwArray9) {
        if (elem % 2 == 0) {
            println("четное")
        } else {
            println("не четное")
        }
    }
    println("Task 9 on Array")


    println("Task 10 on Array ${hw10(arrayOf("Hey", "You", "Come", "Here", "Bastard"), "Bas")}")

    //List

    val hwList1 = listOf<Int>()
    println("Task 1 on List $hwList1")

    val hwList2 = listOf("My", "Funny", "Valentine")
    println("Task 2 on List $hwList2")

    val hwList3 = listOf(1, 2, 3, 4, 5)
    println("Task 3 on List $hwList3")

    val hwList4 = mutableListOf(11, 12, 14, 19, 22)
    hwList4.add(4)
    hwList4.add(28)
    hwList4.add(17)
    println("Task 4 on List $hwList4")

    val hwList5 = mutableListOf("This", "is", "my", "dream")
    hwList5.remove("dream")
    println("Task 5 on List - $hwList5 ")

    val hwList6 = listOf(1, 2, 3, 4, 10)
    println("Task 6 on List")
    for (element in hwList6) {
        println(element)
    }

    val hwList7 = listOf("iphone", "12", "mini", "white")
    println("Task 7 on List ${hwList7[2]}")

    val hwList8 = mutableListOf(14, 52, 95, 7, 13)
    hwList8[2] = 5
    println("Task 8 on List $hwList8")

    val hwList9 = listOf("mass", "effect")
    val hw9List = listOf("my", "favorite", "game")

    val getGame = mutableListOf<String>()
    for (element in hwList9) {
        getGame.add(element)
    }
    for (element in hw9List) {
        getGame.add(element)
    }
    println("Task 9 on List $getGame")

    val hwList10 = listOf(52, 45, 74, 5)
    var min = hwList10[0]
    var max = hwList10[0]
    for (num in hwList10) {
        if (num > max) {
            max = num

        } else if (num < min) {
            min = num
        }
        println("Task 10 on List min: $min, max: $max")
    }

    val hwList11 = listOf(13, 41, 63, 41, 13, 12, 24, 68, 75)
    var justListNumbers = mutableListOf<Int>()
    for (number in hwList11) {
        if (number % 2 == 0) {
            justListNumbers.add(number)
        }
    }
    println("Task 11 - $justListNumbers")

    //Set

    val hwSet1 = setOf<Int>()
    println("Task 1 on Set $hwSet1")

    val hwSet2 = setOf(1, 2, 4, 5, 668, 65)
    println("Task 2 on Set $hwSet2")

    val hwSet3 = setOf("Hey", "Boy", "Hey", "Girl")
    println("Task 3 on Set $hwSet3")

    val hwSet4 = mutableSetOf<String>()
    hwSet4.add("War")
    hwSet4.add("War never change")
    println("Task 4 on Set $hwSet4")

    val hwSet5 = mutableSetOf(1, 2, 51, 56, 29, 85)
    hwSet5.remove(2)
    println("Task 5 on Set $hwSet5")

    val hwSet6 = setOf(8, 19, 70, 34, 6)
    for (e in hwSet6) {
        println(e)
    }
    println("Task 6 on Set")

    println("Task 7 on Set ${hwSet7(setOf("Sopranos", "breaking bad", "Twin Peaks"), "Twin")}")

    val set1 = setOf("Delay", "Reverb", "Echo")
    val set2 = setOf("Fuzz", "Drive", "Dist")
    val hwSet8 = mutableSetOf<String>()

    for (element in set1) {
        hwSet8.add(element)
    }
    for (element in set2) {
        hwSet8.add(element)
    }
    println("Task 8 on Set $hwSet8")

    val setNumbeers1 = setOf(1, 4, 5, 9, 15)
    val setNumbers2 = setOf(4, 8, 15, 22)
    val hwSet9 = mutableSetOf<Int>()

    for (x in setNumbeers1){
        for (y in setNumbers2){
            if(x==y){
                hwSet9.add(x)
            }
        }
    }
    println("Task 9 on Set $hwSet9")

    val setStrings1 = setOf("Beer", "Wine", "Rom")
    val setStrings2 = setOf("Cola","Rom", "juice")

    val hwSet10 = mutableSetOf<String>()

    for(element in setStrings1){
        for (secondElement in setStrings2){
            if (element !in setStrings2 ){
                hwSet10.add(element)
            }
        }
    }
    println("Task 10 on Set $hwSet10")

    val hwSet11 = setOf("Boat", "Ocean", "See")
    val setToList = mutableListOf<String>()
    for (element in hwSet11){
         setToList.add(element)
    }
    println("Task 11 on Set convert to List $setToList")
}

fun hw10(hwArray10: Array<String>, key: String): String {
    for (elem in hwArray10) {
        if (elem.contains(key)) {
            return elem
        }
    }
    return key
}

fun hwSet7(hw7Set7: Set<String>, searchString: String): Boolean {
    for (element in hw7Set7) {
        if (element.contains(searchString)) {
            return true
        }
    }
    return false
}