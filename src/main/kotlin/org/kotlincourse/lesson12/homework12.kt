///////1. Предварительные задачи на использование методов.


fun main() {
///////// Задачи на приведение коллекций к значению
    val hwtestList = listOf(2, 4, 1, 5, 1, 9)
    println("Task 1 ${hwtestList.size > 5}")

    val hwIsEmpty = listOf<Int>()
    println("Task 2 ${hwIsEmpty.isEmpty()}")

    val hwIsNotEmpty = listOf("Eto", "Prosto", "Neveroyatno")
    println("Task 3 ${hwIsNotEmpty.isNotEmpty()}")

    val hwGetOrElse = listOf<Int>()
    println("Task 4 ${hwGetOrElse.getOrElse(4) { 9 }}")

    val hwJoinToString = listOf(2.0, 3.5, 5.6, 9.8)
    println("Task 5 ${hwJoinToString.joinToString(separator = ", ") { "$it G" }}")

    val hwSum = listOf(2, -9, 14, 56, -32)
    println("Task 6 ${hwSum.sum()}")

    val hwAvarage = listOf(2, 5, 9, 19, 23, 15, 18)
    println("Task 7 ${hwAvarage.average()}")

    val hwMax = listOf(2.3, 5.8, 0.1, 7.3, 19.0)
    println("Task 8 ${hwMax.max()}")

    val hwMin = listOf(-1, 0, 1, 9, -4, 28)
    println("Task 9 ${hwMin.min()}")

    val firstOrNull = listOf(-1, 0, 1, 9, -4, 28)
    println("Task 10 ${firstOrNull.firstOrNull()}")

    val containsList = listOf("Dog", "Sleep", "Relax")
    println("Task 11 ${containsList.contains("Dog")}")


///////////////// Задачи на обработку коллекций
    val hwFillList = listOf(2, 19, 23, 34)
    println("Task 1 ${hwFillList.filter { it in 18..30 }}")

    println("Task 2 ${hwFillList.filterNot { it % 2 == 0 && it % 3 == 0 }}")

    val hwFillListNull = listOf(2, 19, null, 23, 34, null)
    println("Task 3 ${hwFillListNull.filterNotNull()}")

    val lenghtStrings = listOf("Dog", "Sleep", "Relax", "Bark")
    println("Task 4 ${lenghtStrings.map { it.length }}")

    val mapOfWordReverseWord = listOf("Dog", "Sleep", "Relax", "Bark")
    println("Task 5 ${mapOfWordReverseWord.map { it to it.reversed() }}")

    val sortedAlphabet = listOf("A", "G", "E", "B", "C", "F", "D")
    println("Task 6 ${sortedAlphabet.sorted()}")

    val sortedListDescending = listOf("A", "G", "E", "B", "C", "F", "D")
    println("Task 7 ${sortedListDescending.sortedDescending()}")

    val squarePrintElemnts = listOf(2, 4, 5, 9, 3, 7, 12)
    println("Task 8 ${squarePrintElemnts.map { it * it }}")

    val groupByWord = listOf("Dog", "Sleep", "Relax", "Bark", "Diego", "Snack")
    println("Task 9 ${groupByWord.groupBy { it.first() }}")

    val distinctList = listOf("Dog", "Sleep", "Relax", "Bark", "Dog", "Dog", "Snack")
    println("Task 10 ${distinctList.distinct()}")

    val firstThreeWord = listOf("Dog", "Sleep", "Relax", "Bark", "Diego", "Snack")
    println("Task 11 ${firstThreeWord.take(3)}")

    val lastThreeElemnts = listOf(2, 4, 5, 9, 3, 7, 12)
    println("Task 12 ${lastThreeElemnts.takeLast(3)}")

    discription(listOf(1, 2, 3, 4))
    discription(listOf())
    discription(listOf(0, 2, 1, 1, 51, 51, 15))
    discription(listOf(4999, 5000, 1, 2, 1, 5, 90))
    discription(listOf(10, 10, 10, 10, 10, 10, 10))
    discription(listOf(-100, -50, -20, -19, -18, 17))
    discription(listOf(5000, 6000, 9000, 8000, 7000, 4545))

    taskGrades()
    taskCatalog()
    taskAvg()
    categoryNumbers()
}

/// Задание 2: Характеристика числовой коллекции
fun discription(collection: List<Int>?) {
    when {
        collection == null -> println("Empty")
        collection.size < 5 -> println("Short")
        collection.getOrElse(0) { 0 } == 0 -> println("Start")
        collection.sum() > 10000 -> println("Massive")
        collection.average() == 10.0 -> println("Balance")
        //collection.map { it.length } == 20 -> println("Sticky")
        collection.max() < -10 -> println("Negative")
        collection.min() > 1000 -> println("Positive")
        //collection.contains("3") && collection.contains("14") -> println("Fucking Pi")

    }
}

fun taskGrades() {
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

    val newGrades = grades.filter { it >= 60 }
    val sortedGrades = newGrades.sorted()
    println("Task grades ${sortedGrades.take(3)}")
}

fun taskCatalog(){
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    val lowerList = list.map { it.lowercase() }
    println("Task lower group list ${lowerList.groupBy { it.first() }}")

}

fun taskAvg(){
    val spisok = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    val lenght = spisok.map { it.length }
    println("Task avg lenght strings ${lenght.average()}")

}

fun categoryNumbers(){
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    val distinctNumbers = numbers.distinct()
    val sortedDescending = distinctNumbers.sortedDescending()
    println("Task category numbers ${sortedDescending.groupBy { if (it % 2 == 0) "Even" else "Odd" }}")
}