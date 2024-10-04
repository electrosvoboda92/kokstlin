package org.kotlincourse.lesson7
import kotlin.math.*


fun main(){
//    straightRange()
//    straightRange2()
//    reverseRange()
//    reverseRange2()
//    straightRangeWithStep()
//    straightRangeWithStep2()
//    straightRangeUsedUntill()
//    straightRangeUsedUntill2()
//    taskForWhile()
//    taskForWhile2()
//    taskDoWhile()
//    taskDoWhile2()
//    forBreaker()
//    breakWhile()
//    continueFor()
    continueWhile()
//    ebat()
}


fun straightRange(){
    for (i in 1..5){
        println(i)
    }
}

fun straightRange2(){
    for (i in 1..10){
        if (i%2 == 0){
            println(i)
        }

    }
}

fun reverseRange(){
    for (i in 5 downTo 1){
        println(i)
    }
}

fun reverseRange2(){
    for (i in 10 downTo 1){
        println(i - 2)
    }
}

fun straightRangeWithStep(){
    for (i in 1 .. 9 step 2){
        println(i)
    }
}

fun straightRangeWithStep2(){
    for (i in 1 .. 20 step 3){
        println(i)
    }
}


fun straightRangeUsedUntill(){
    for (i in 1 until 9){
        println(i)
    }
}

fun straightRangeUsedUntill2(){
    for (i in 3 until 15){
        println(i)
    }
}

fun taskForWhile(){
    var counter = 0.0
    var kvadreat = 1.0
    while (counter < 5){
        counter+=1
        kvadreat = counter.pow(2.0)
        println(kvadreat)
    }
}

fun taskForWhile2(){
    var counter = 11
    while (counter > 5){
        counter-=1
        println(counter)
    }
}

fun taskDoWhile(){
    var i = 5
    do {
        println(i)
        i--
    } while (i > 0)
}

fun taskDoWhile2(){
    var i = 5
    do {
        println(i)
        i++
    }while (i < 10)
}

fun forBreaker(){
    for (i in 1..10){
        println(i)
        if (i == 6){
            break
        }
    }
}

fun breakWhile(){
    var i = 1
    while (true){
        i++

        if (i == 10){
            break
        }
        if (i%3 == 0){
            println(i)
        }
    }
}

fun continueFor(){
    for (i in 1..10){
        if (i%2 == 0) continue
        println(i)
    }
}

fun continueWhile(){
    var i = 1
    while (i < 10){
        i++
        if (i%3 == 0) continue
        println(i)
    }
}

fun ebat(){
    for (i in 1 .. 10){
        print(" ")
        for (x in 1..10){
            print(x * i)
            print(" ")
        }
        println()
    }
}