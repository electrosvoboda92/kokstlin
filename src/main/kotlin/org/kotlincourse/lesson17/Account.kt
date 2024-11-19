package org.kotlincourse.lesson17

class Account(private var balance: Double) {
    fun deposit(amount: Double){
        if (amount > 0){
            balance+=amount
        }
    }

    fun getBalance(): Double{
        return balance
    }
}