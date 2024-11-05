package org.kotlincourse.lesson14.Homework14

object Moon {

    private var isVisible = true
    private var phase: String = "Full Moon"

    fun showPhase(isVisible: Boolean, phase: String){
        if(isVisible==true){
            this.phase = when(phase){
                in "Full Moon" -> "Full Moon"
                in "Part of moon" -> "Month"
                in "Grow moon" -> "New moon"
                else -> ""
            }
            println(this.phase)

        }else{
            this.phase = "Not visible"
            println(this.phase)
        }





    }
}