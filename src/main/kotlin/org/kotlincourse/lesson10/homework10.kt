fun main() {
    val hwDict1 = mapOf<Int, Int>()
    println("Task 1: $hwDict1")

    val hwDict2 = mapOf(10F to 2.0)
    println("Task 2: $hwDict2")

    val hwDict3 = mutableMapOf<Int, String>()
    println("Task 3: $hwDict3")

    hwDict3[0] = "First"
    hwDict3[1] = "Second"
    hwDict3[2] = "Third"
    println("Task 4: $hwDict3")

    println("Task 5: ${hwDict3[5]}")

    hwDict3.remove(0)
    println("Task 6: $hwDict3")

    val hwDict7 = mapOf(22.0 to 4, 3.8 to 6, 4.1 to 81, 1.0 to 0)
    for ((keys, values) in hwDict7) {
        if (values == 0) {
            println("Task spec 7:Infinity")
        } else {
            val result = keys / values
            println("Task 7: $result")
        }
    }

    val hwDict8 = mutableMapOf("Gain" to 5, "Volume" to 8, "Low" to 4, "Middle" to 6, "High" to 7)
    hwDict8["Low"] = 8
    println("Task 8: $hwDict8")

    val dict1 = mapOf(2 to "Dva", 4 to "Chetiri")
    val dict2 = mapOf(3 to "Tri", 5 to "Pyat")
    val hwDict9 = mutableMapOf<Int, String>()
    for ((keys1, values1) in dict1) {
        hwDict9[keys1] = values1
        for ((keys2, values2) in dict2) {
            hwDict9[keys2] = values2
        }
    }
    println("Task 9: $hwDict9")

    val hwDict10 = mutableMapOf<String, List<Int>>()
    hwDict10["Ratata"] = listOf(1, 3, 5)
    hwDict10["Sneg"] = listOf(9, 19, 201, 1)

    println("Task 10: $hwDict10")

    val hwDict11 = mutableMapOf<Int, Set<String>>()
    hwDict11[27] = mutableSetOf("Nirvana", "Doors", "Jimmy Hendrix")
    hwDict11[60] = mutableSetOf("Pink Floyd", "Beatles")
    println("Task 11: $hwDict11")

    val hwDict12: Map<Pair<Int, Int>, String> = mapOf(
        Pair(1, 2) to "First",
        Pair(3, 4 ) to "Second",
        Pair(5, 6) to "Third",
        Pair(7,8) to "Fourth",
        Pair(9, 5) to "Fifth"
    )
    for((key, value) in hwDict12){
        if(key.first == 5 || key.second == 5){
            println("Task 12 $key : $value")
        }
    }
}

