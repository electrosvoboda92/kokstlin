package org.kotlincourse.lesson13


fun main() {

    val fruitPrices = mapOf(
        "apple" to 2.99,
        "banana" to 1.0,
        "orange" to 2.51,
        "cherry" to 3.99
    )

    for (entry in fruitPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

    for ((fruit, price) in fruitPrices) {
        println("Key: $fruit, Value: $price")
    }


    val entries: Set<Map.Entry<String, Double>> = fruitPrices.entries
    val keys: Set<String> = fruitPrices.keys
    val values: Collection<Double> = fruitPrices.values

    val priceOfPearOrElse = fruitPrices.getOrElse("pear") { throw IllegalArgumentException() }
    val priceOfApple = fruitPrices.getValue("apple")
    val priceOfPearOrDefault = fruitPrices.getOrDefault("pear", 0.0)

    val fruitWithoutBanana = fruitPrices - "banana"
    val fruitWithPineapple = fruitPrices + ("pineapple" to 3.5)
    val mutableFruits = fruitPrices.toMutableMap()

    mutableFruits["kiwi"] = 2.75
    mutableFruits.putAll(mapOf("lime" to 1.1, "avacado" to 2.99))
    mutableFruits.remove("orange")
    mutableFruits.clear()

    val containsApple = fruitPrices.containsKey("apple")
    val containsValue1_5 = fruitPrices.containsValue(1.5)
    val isEmpty = fruitPrices.isEmpty()
    val isNotEmpty = fruitPrices.isNotEmpty()
    val areAllFruitsExpensive = fruitPrices.all { it.value > 1.0 } // && logic AND
    val isAnyFruitCheap = fruitPrices.any { it.value < 1.0 } // || logic OR

    val filteredByPrice = fruitPrices.filter { it.key.contains("a") && it.value > 1.0 }
    val filteredBykeys = fruitPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits: Int = fruitPrices.count { it.value > 1.5 }

    val increasedPrices = fruitPrices.mapValues { it.value * 1.1 }
    val fruitNamesUppercase = fruitPrices.mapKeys { it.key.uppercase() }
    val fruitList = fruitPrices.map { "${it.key} costs ${it.value}" }


    val toMap = mutableFruits.toMap()
    val toMutableMap = mutableFruits.toMutableMap()

    fruitPrices.forEach {(fruit, price) ->
        println("$fruit costs $price")
    }
    fruitPrices.forEach {it ->
        println("${it.key} costs ${it.value}")
    }




}