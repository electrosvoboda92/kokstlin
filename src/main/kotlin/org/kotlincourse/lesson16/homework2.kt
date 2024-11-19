package org.kotlincourse.lesson16

abstract class Shape{
    open fun area(long: Double,  h: Double): Double{
        return 0.0
    }
}

//, Square, Triangle

class Circle: Shape(){
    override fun area(r: Double, h: Double): Double {
        return r * r * 3.14
    }
}

class Square: Shape(){
    override fun area(long: Double, h: Double): Double {
        return long * long
    }
}

class Triangle: Shape(){
    override fun area(long: Double, h: Double): Double {
        return long * h
    }
}