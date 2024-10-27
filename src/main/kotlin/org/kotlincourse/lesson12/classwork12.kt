package org.kotlincourse.lesson12


fun main() {
    val list = listOf(3, 53, 39, 78, 24, 12, 15)
    val filtered1 = hilter(list)
    println(filtered1)

    val filtered2 = list.filter { it in 7..17 }
    println(filtered2)

    val numbers = listOf(-1, 2, 4, -3, 5, -5)
    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers)

    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers)

    val nullableList: List<Int?> = listOf(1, null, 2, 3, null)
    val nonNullbaleList: List<Int> = nullableList.filterNotNull()
    println(nonNullbaleList)

    val firtsPositive: Int? = numbers.firstOrNull { it > 0 }
    println(firtsPositive)

    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse)

    val incrementedNumbers = numbers.map { it + 10 }
    println(incrementedNumbers)

    val changeTypeNumbers: List<String> = numbers.map { "$it this is string" }
    println(changeTypeNumbers)

    val numberSquareMap: Map<Int, Int> = numbers.associate { it to it * it }
    println(numberSquareMap)

    val multiList = listOf(
        listOf(1, 4, 5, 9),
        listOf(2, 7, 8)
    )
    println(multiList)

    val flattenList = multiList.flatten()
    println(flattenList)

    val flattenListAfterMapping = multiList.flatMap { list1: List<Int> ->
        list1.map { it * 2 }
    }
    println(flattenListAfterMapping)

    val numberString = numbers.joinToString(separator = "; "){"$it "}
    println(numberString)

    val sortedNumbers = numbers.sorted()
    println(sortedNumbers)

    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers)

    numbers.forEach{
        println(it)
    }

    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers)

    val avarageOfNumbers = numbers.average()
    println(avarageOfNumbers)

    val maxOfNumbers = numbers.max()
    println(maxOfNumbers)

    val minOfNumbers = numbers.min()
    println(minOfNumbers)

    val groupeBySign = numbers.groupBy { if(it > 0) "Positive" else "Negative" }
    println(groupeBySign)

    val distinctNumbers = listOf(1, 2, 4, 5, 2, 8, 4).distinct()
    println(distinctNumbers)

    println(numbers.take(3))
    println(numbers.takeLast(3))

    println(numbers.size)

}

fun hilter(collection: List<Int>): List<Int> {
    val reult = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) reult.add(i)
    }
    return reult
}