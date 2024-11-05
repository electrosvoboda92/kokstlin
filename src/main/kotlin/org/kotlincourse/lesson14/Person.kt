package org.kotlincourse.lesson14

class Person(
    val name: String,
    val age: Int = 27
) {
    fun sayHello() {
        println("Hello, my name $name and I am $age years old")
    }


}