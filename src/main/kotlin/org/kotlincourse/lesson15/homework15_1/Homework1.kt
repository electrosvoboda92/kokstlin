package org.kotlincourse.lesson15.homework15_1

open class Shape(
    val length: Double
)

open class Polygon(
    length: Double,
    val countSide: Int
) : Shape(length) {
    fun count(length: Double, countSide: Int) {
        println("This is polygon has count side $countSide and length: $length")
    }
}

class Circle(
    length: Double,
    val pi: Double = 3.1415
) : Shape(length)

class Triangle(
    length: Double,
    val lengthA: Double,
    val lengthB: Double,
    countSide: Int
) : Polygon(length, countSide)

class Square(
    length: Double,
    countSide: Int,
    val lengthA: Double
) : Polygon(length, countSide)