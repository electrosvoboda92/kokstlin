package org.kotlincourse.lesson21

fun main() {
    val obj: Any = "Hello, World"

    if (obj is String) {
        println("obj is string")
    }

    if (obj !is Int) {
        println("obj is not number")
    }

    if (obj is String) {
        //obj автоматически приведен в String
        println(obj.uppercase())
        obj.length
    }

    val num: Any = 123
    val num2: Any = 456

//    val str: String = num as String
//    val safeStr: String? = num2 as? String

    val nullableStr: String? = "Kotlin"
    val nonNullableStr: String = nullableStr as String

    println(nonNullableStr)

    val mixedlist: List<Any> = listOf("Jo", 42, 3.14, "Go", false)

    for (item in mixedlist) {
        when (item) {
            is String -> println("$item - this is String with lenght ${item.length}")
            is Int -> println("$item - this is number")
            is Double -> println("$item - this is double")
            else -> println("Unknown type")
        }
    }


    val flyingCar = FlyingCar()

    checkCapabilities(flyingCar)

    val i: Any = "This"
    println(i as String)

    if (i is Int) {
        println(i)
    } else {
        println("This is not Int")
    }

    val i_two: Any = "Shit"
    println(i_two as? Int ?: " This is not Int")

    val fl: Any = listOf("Bark", "Like")
    if (fl is List<*>) {
        (fl[0] as String).length
    }

    val fl2: Any = listOf("Wtf", "Pro")
    println(fl2 as List<Int>)


}

interface Drivable {
    fun drive()
}

interface Flyable {
    fun fly()
}

class FlyingCar : Drivable, Flyable {
    override fun drive() {
        println("Driving like car")
    }

    override fun fly() {
        println("Flying like plane")
    }
}

class Car : Drivable {
    override fun drive() {
        println("Driving like car")
    }
}

fun checkCapabilities(drivable: Drivable) {
    drivable.drive()

    if (drivable is Flyable) {
        println("This is object also can fly")
        drivable.fly()
    } else {
        println("This is object can't fly")
    }
}