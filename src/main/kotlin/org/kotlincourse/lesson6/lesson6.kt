package org.kotlincourse.lesson6


fun main(){
    season("Sep")
    whitchPetAge(7)
    typeOfTransport(6)
    calcBonus(1100)
    determinationTypeDocument("jpg")
    getTemperature(8, "C")
    getTemperature(78, "F")
    getClothesForWeather(-8)
    choiceMovie(18)
}

fun season(month:String?){
    if (month == "Jan" || month == "Feb" || month == "Dec"){
        println("Winter")
    }
    else if (month == "Mar" || month == "Apr" || month == "may"){
        println("Sping")
    }
    else if (month == "Jun" || month == "Jul" || month == "Aug"){
        println("Summer")
    }
    else if (month == "Sep" || month == "Oct" || month == "Nov"){
        println("Fall")
    }
}

fun whitchPetAge(petAge: Int){
    if ( petAge <= 2 && petAge > 0){
        val petAgeHuman = petAge * 10.5
        println("pet age = $petAgeHuman")
    }
    else if (petAge >= 4){
        val petAgeHuman = (petAge - 2) * 4 + 21
        println("pet age = $petAgeHuman")
    }
}

fun typeOfTransport(distance: Int){
    if (distance <= 1){
        println("You need to use your legs")
    }
    else if (distance <= 5 && distance > 1){
        println("You need to use your bike")
    }
    else if (distance > 5){
        println("You need to use your car")
    }
}

fun calcBonus(totalSum: Int){
    val minSum: IntRange = 1 .. 1000
    if (totalSum in minSum){
        val countSotki = totalSum / 100
        val resultBonus = 2 * countSotki
        println("кол-во бонусов = $resultBonus")
    }
    else if (totalSum > 1000){
        val countBonus2= 10
        val countSotki = (totalSum / 100) - 10
        val resultBonus = 5 * countSotki + countBonus2
        println("кол-во бонусов = $resultBonus")
    }
}

fun determinationTypeDocument(typeOfDocument:String){
    if (typeOfDocument == "txt"){
        println("Текстовый документ")
    }
    else if (typeOfDocument == "jpg"){
        println("Изображение")
    }
    else if (typeOfDocument == "exc"){
        println("Таблица")
    }
    else {
        println("Изображение")
    }
}

fun getTemperature(temperature: Int, typeOfTemp: String){
    if (typeOfTemp == "C"){
        val farengate = (temperature * 9)/5 + 32
        println("Температура $farengate F")
    }
    else if(typeOfTemp == "F"){
        val celcius = 5 * (temperature - 32)/9
        println("Температура $celcius C")
    }
}

fun getClothesForWeather(temperature: Int){
    var costume1 = 0 .. 15
    var costume2 = 15..35
    var costume3 = -30 .. 0
    if (temperature in costume1){
        println("windbreaker")
    }
    else if (temperature in costume2){
        println("Tshirt + shorts")
    }
    else if (temperature in costume3){
        println("jacket + cap")
    }
    else if (temperature < -30 ){
        println("Stay home")
    }
    else if (temperature > 35){
        println("Stay home")
    }
}

fun choiceMovie(age: Int){
    var forKids = 0..12
    var forTeen = 13..17
    var forAdults = 18
    if (age in forKids){
        println("You can watch movie for kids")
    }
    else if (age in forTeen){
        println("You can watch movies for Teenager and Kids")
    }
    else if(age >= forAdults){
        println("You can watch all movies")
    }
}