package org.kotlincourse.lesson17

fun main() {
    val account = Account(0.0)

    val student = Student("Top", 27, 16413)
    student.showAge()
}

class Lamp() {
    private var isOn = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }
}

open class GameConsole() {
    fun startGame(nameGame: String) {
        initHardWare()
        loadGame(nameGame)
    }

    protected open fun initHardWare() {
    }

    private fun loadGame(nameGame: String) {
    }
}

class PlayStation : GameConsole() {
    override fun initHardWare() {
        super.initHardWare()
        "efe".length
    }
}

class Atm(
    private var balance: Float = 0.0f,
    private var pin: String
) {

    private fun checkPin(pin: String){
        if (pin != this.pin) {
            throw Exception("This is not correct pin")
        }
    }

    fun deposit(pin: String, amount: Float) {
        checkPin(pin)
    }

    fun withdraw(amount: Float, pin: String): Float {
        checkPin(pin)
        return amount
    }

    fun getBalance(pin: String): Float {
        checkPin(pin)
        return balance
    }
}

