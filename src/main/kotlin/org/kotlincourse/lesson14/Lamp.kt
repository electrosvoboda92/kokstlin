package org.kotlincourse.lesson14

class Lamp(var switchOn: Boolean) {
    fun switch(){
        switchOn = !switchOn
        println(switchOn)
    }
}