package org.kotlincourse.lesson16

abstract class Animal(){
    open fun makeSound(){
        println("This animal makes no sound.")
    }
}

class Dog: Animal(){
    override fun makeSound() {
        printColored("Bark", Colors.YELLOW)
    }
}

class Cat: Animal(){
    override fun makeSound() {
        printColored("Meow", Colors.BLUE)
    }
}

class Bird: Animal(){
    override fun makeSound() {
        printColored("Tweet", Colors.GREEN)
    }
}

fun main(){
    val Animals = listOf(
        Dog(),
        Cat(),
        Bird()
    )
    for(i in Animals){
        i.makeSound()
    }
}