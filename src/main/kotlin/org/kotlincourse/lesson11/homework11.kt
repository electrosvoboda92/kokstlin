package org.kotlincourse.lesson11

fun main(){
    println("Spec Task 1 ${multyPlayByTwo(4)}")
    println("Spec Task 2 ${isEven(5)}")
    println("Spec Task 3 ${printNumberUntil(5)}")
    println("Spec Task 4 ${findFirstNegative(listOf(2, 5, -1, - 4))}")
    println("Spec Task 5:")
    processList(listOf("Kak", "Ze", "Eto", "Vse", "", "Hahaha"))
    println("Task 1: ${hwFun1()}")
    println("Task 2: ${hwFun2(4, 9)}")
    println("Task 3: ${hwFun3("Hu")}")
    println("Task 4: ${hwFin4(listOf(1, 2, 3, 4))}")
    println("Task 5: ${hwFun5("Kak")}")
    println("Task 6: ${hwFun6()}")
    println("Task 7: ${hwFun7(listOf(1, 3, 10))}")
    println("Task 8: ${hwFun8(2)}")
    println("Task 9: ${hwFun9()}")
    println("Task 10: ${hwFun10("Eat", 2)}")

}

fun multyPlayByTwo(number: Int): Int{
    return number*2
}

fun isEven(number: Int): Boolean{
    if (number % 2 == 0){
        return true
    }
    else{
        return false
    }
}

fun printNumberUntil(n: Int): Int{
    var i = 0
    while (n > i){
        println(i)
        i++
    }
    return i
}

fun findFirstNegative(spicok: List<Int>): Int? {
    for (i in spicok){
        if (i < 0){
            return i
        }
    }
    return null
}

fun processList(spisokStrok: List<String>): String?{
    for (stroka in spisokStrok){
        if(stroka.isEmpty()){
            return null
        }
        println(stroka)
    }
    return null
}

fun hwFun1(){

}

fun hwFun2(number1: Int, number2:Int) = number1 + number2

fun hwFun3(stroka: String){

}

fun hwFin4(spisokNumbers: List<Int>): Double?{
    var count = 0
    for (i in spisokNumbers){
        count += i
    }
    return (count/spisokNumbers.size).toDouble()
}

fun hwFun5(stroka: String?): Int?{
    val a = stroka?.length
    return a
}

fun hwFun6():Float?{
    return null
}

fun hwFun7(spisok: List<Int>?):Int?{
    return null
}

fun hwFun8(number: Int): String?{
    return null
}

fun hwFun9():List<String>?{
    return null
}

fun hwFun10(stroka: String?, number: Int?): Boolean?{
    return null
}