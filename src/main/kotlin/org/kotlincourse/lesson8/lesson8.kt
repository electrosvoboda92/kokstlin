package org.kotlincourse.lesson8

fun main(){

    val justString1 = "Fast"
    val justString2 = "Charge"
    val frase = justString1 + " " + justString2

    println(frase)

    val age = 32
    val fullName = "Ivan"
    val greeting = "Hello! My name is $fullName, I'm $age"

    println(greeting)

    val person = Person("Max", 30)
    val introduction = "He is name ${person.name} and He is ${person.age}"

    println(introduction)

    val details = "There is ${getDetails()}"
    println(details)


    val x = 10
    val y = 20
    val resulString = "Result solution x + y = ${x + y}"
    println(resulString)

    val originalString = "Kotlin is maybe fun"
    val subString  = originalString.substring(7)
    val subString2 = originalString.substring(3, 6)
    println(subString)
    println(subString2)

    val replacedString = originalString.replace("fun","interesting" )
    println(replacedString)

    val words = originalString.split(" ")
    println(words.joinToString("\n"))

    val length = "Hello".length
    println(length)

    val upper = "Hello".uppercase()
    println(upper)

    val lower = "BLEAT".lowercase()
    println(lower)

    val trimmed = "  wth .".trim('h','.', ' ')
    println(trimmed)


    val starts = "kotlin".startsWith("kot")
    println(starts)
    val ends = "kokstlim".endsWith("lim")
    println(ends)
    val contains = "Joker".contains("ok")
    println(contains)

    val e: String? = " "
    val empty = e.isNullOrEmpty()
    println(empty)

    val blank = "    ".isNullOrBlank()
    println(blank)

    val repeat = "ab".repeat(3)
    println(repeat)

    val letter = originalString[5]
    println(letter)

    val indexOfChar = "kokpit".indexOf("p")
    println(indexOfChar)

    val indexOfWord = "Kotlin is strange".indexOf("strange")
    println(indexOfWord)

    val reverse = "navI".reversed()
    println(reverse)

    val multiString = """
        First string
        Second string 
        Third string
    """.trimIndent()
    println(multiString)

    val namePerson = "Vi"
    val city = "Night city"
    val agePerson = 27
    val rating = 50.5343
    val balance = 742123.97
    val text = """
        name: %s
        city: %s
        age: %d
        rating: %.1f
        balance: $%,.2f
    """.trimIndent()
    println(text.format(namePerson, city, agePerson, rating, balance))
}

class Person( val name: String, val age: Int)

fun getDetails():String {
    return "Smth text"
}

