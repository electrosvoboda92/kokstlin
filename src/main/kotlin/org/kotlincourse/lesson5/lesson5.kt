package org.kotlincourse.lesson5

fun main(){
    println( fadeOut(30.0, null))
    println(costDelivery(2.0))
    pressure(null)
    getPress(null)
}

fun fadeOut(coefOne: Double, maybyCoeg: Double?): Double{
    val koef: Double = maybyCoeg ?: 0.5
    return coefOne * koef
}

fun costDelivery(insurCoef: Double?): Double{
    val insur = insurCoef ?: 50.0
    val costDeliver = insur * 0.005

    return insur + costDeliver
}

fun pressure(coefDavl: Double?) {
    if (coefDavl == null) {
        println("Error")
    }
    else {
        println("Let's go")
    }
}

fun getPress(report: String?){
    println( report ?: throw Exception())
}