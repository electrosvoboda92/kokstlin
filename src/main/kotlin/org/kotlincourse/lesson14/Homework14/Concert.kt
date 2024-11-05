package org.kotlincourse.lesson14.Homework14

class Concert(
    val band:String,
    val place: String,
    val price: Int,
    val volumeHall: Int,
    private var countSellTickets: Int = 0
) {


    fun event(){
        println("This is concert $band will be $place. Cost ticket $price. Count seet $volumeHall")
    }

    fun buyTicket(){
        println(countSellTickets + 1)
    }
}