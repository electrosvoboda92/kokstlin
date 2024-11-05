package org.kotlincourse.lesson15

fun main() {

}

open class Vehicle(
    val maxWeight: Int,
    val passengerCapacity: Int,
    val serialNumber: String
) {
    open fun startMovement() {
        println("machine starting")
    }

    open fun stopMovement() {
        println("machine stopping")
    }
}

open class WheeledVehicle(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String,
    val wheelCount: Int
) : Vehicle(maxWeight, passengerCapacity, serialNumber)


class Car(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String,
    wheelCount: Int,
    val engineType: String,
    val bodyType: String
) : WheeledVehicle(maxWeight, 5, serialNumber, wheelCount) {
    fun turnOnLight() {
        println("Light is On")
    }

    fun turnOffLight() {
        println("Light is off")
    }

    fun activateTurnSignal(direction: String) {
        println("Direction $direction is on")
    }

    fun activateWipers(){
        println("Window cleaner is On")
    }
}

class Bicycle(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String
) : WheeledVehicle(maxWeight, passengerCapacity, serialNumber, 2) {

    fun pedal() {
        println("Педали крутятся.")
    }
}

// Класс Летательные аппараты
open class Aircraft(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String,
    val flightAltitude: Int
) : Vehicle(maxWeight, passengerCapacity, serialNumber) {

    fun increaseAltitude(amount: Int) {
        println("Высота увеличена на $amount метров.")
    }

    fun decreaseAltitude(amount: Int) {
        println("Высота уменьшена на $amount метров.")
    }
}

// Класс Самолёт, наследующийся от Летательного аппарата
class Airplane(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String,
    flightAltitude: Int
) : Aircraft(maxWeight, passengerCapacity, serialNumber, flightAltitude)

// Класс Вертолёт, наследующийся от Летательного аппарата
class Helicopter(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String,
    flightAltitude: Int
) : Aircraft(maxWeight, passengerCapacity, serialNumber, flightAltitude)