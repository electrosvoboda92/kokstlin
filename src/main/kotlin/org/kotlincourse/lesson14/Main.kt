package org.kotlincourse.lesson14

import org.kotlincourse.lesson14.Homework14.*

fun main() {
    val person = Person("John", age = 32)
    person.sayHello()

    val newPerson = Person("Kurt")
    newPerson.sayHello()

    Logger.setData(5)
    Logger.log("Hey Oh")
    Logger.log("Lets go")

    val result = Calculator.add(2, 3)
    println(result)

    val whichConst = Calculator.VERSION
    println(whichConst)

    User(1, "Bond")

    var testLamp = Lamp(true)
    testLamp.switch()

    val detailsParty = Party("My home", 12)
    detailsParty.details()

    val getEmotion = Emotion("Tired", 10)
    getEmotion.express()

    Moon.showPhase(false, "Full")
    Moon.showPhase(true, "Full Moon")

    val newProduct = Product("Cheese", 251.50, 1)
    println(newProduct)

    val event = Concert("Phases of the moon", "Albert Hall",45,2000 , 245)
    event.event()
    event.buyTicket()
}