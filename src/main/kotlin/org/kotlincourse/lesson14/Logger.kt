package org.kotlincourse.lesson14

object Logger {

    private var data = 0

    fun log(message: String) {
        println("Log: $message $data")
    }

    fun setData(data: Int) {
        this.data = data
    }
}