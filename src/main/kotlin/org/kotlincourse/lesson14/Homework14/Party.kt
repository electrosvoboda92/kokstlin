package org.kotlincourse.lesson14.Homework14

class Party(
    val location: String,
    val attendees: Int
) {
    fun details() {
        println("Party will be $location and count attendees = $attendees")
    }
}