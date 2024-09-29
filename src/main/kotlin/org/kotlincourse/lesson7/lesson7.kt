package org.kotlincourse.lesson7


fun main(){
    val e = 4
    for (i in listOf("sfa","fsefges")){
    }

    practiscicle()

}

fun cicle1(c:Int){
    for (i in 1..10 step 5){
        println(i)
    }
}

fun whywhile(number: Int){
    var counter = number
    while (counter-- > 0){
        println(counter)
    }
}

fun newcicle(){
    for (i in 1..10){
        if (i==2) continue
        if (i==7)break
        println(i)
    }
}

fun anothercicle(){
    for(i in 10 downTo 1){
        println(i)
    }
}

fun chetnumbers(){
    for (i in 20 downTo 2){
        if (i%2 == 0){
            println(i)
        }
    }
}

fun anotherwhile(){
    var count = 1
    var sum = 0
    while (count <= 10){
        sum += count++
        println(sum)
    }
}

fun practiscicle(){
    var counter = 100
    while (counter > 1){
        println( counter--.toString().length)
    }
}