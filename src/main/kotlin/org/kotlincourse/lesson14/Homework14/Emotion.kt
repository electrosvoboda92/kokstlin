package org.kotlincourse.lesson14.Homework14

class Emotion(
    var type: String,
    var intensity: Int
) {
    fun express() {
        val intensityDiscription = when(intensity){
            in 1..3 -> "Small"
            in 4.. 6 -> "Meddle"
            in 7..9 -> "Strong"
            10 -> "Huge"
            else -> "Dno"
        }
        println("Emotion $type intensity $intensityDiscription")
    }
}