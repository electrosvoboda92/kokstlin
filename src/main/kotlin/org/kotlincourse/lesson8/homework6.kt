fun main() {
//    println(workontheString("Это невозможно выполнить за один день"))
//    println(workontheString("Я не уверен в успехе этого проекта"))
//    println(workontheString("Произошла катастрофа на сервере"))
//    println(workontheString("Этот код работает без проблем"))
//    println(workontheString("Удача"))
//    task1("\"Пользователь вошел в систему -> 2021-12-01 09:48:23\"")
//    task2("4539 1488 0343 6467")
//    task3("username@example.com")
//    task4("C:/Пользователи/Документы/report.txt")
      println(task5("Объектно-ориентированное программирование"))
}

fun workontheString(stroka: String):String {
    var result = stroka

     if (result.contains("невозможно")) {
        result = result.replace("невозможно", "совершенно точно возможно, просто требует времени")
    }

    if (result.startsWith("Я не уверен")) {
        result += ", но моя интуиция говорит об обратном"
    }

    if (result.contains("катастрофа")) {
        result = result.replace("катастрофа", "интересное событие")
    }

    if (result.endsWith("без проблем")) {
        result = result.replace("без проблем", "с парой интересных вызовов на пути")
    }

    if (result.trim().split("\\s+".toRegex()).size == 1) {
        result = "Иногда $result, но не всегда"
    }
    return result
}



fun task1(log: String): String{
    val findTimeData = log.indexOf(">")
    val getTimeData = log.substring(findTimeData until  51)
    val timeanddata = getTimeData.split(" ")
    val data = timeanddata[1]
    val time = timeanddata[2]

    return "$data $time"
}

fun task2(card: String): String{

    val dataCard =card.split(" ")
    val secretData = dataCard[0] + dataCard[1] + dataCard[2]
    val lastNumbers = dataCard[3]
    val secret = secretData.replace(dataCard[0] + dataCard[1] + dataCard[2], "**** **** ****")
    return "$secret $lastNumbers"

}

fun task3(email: String): String{
    val result = email.replace("@", " [at] ").replace(".", " [dot] ")
    return result
}

fun task4(path: String): String{
    val nameFile = path.split("/")

    return nameFile.last()

}

fun task5(frase: String): String{
    var letter = ""

    val getWord = frase.split("-"," ")
    for (word in getWord){
            letter += word[0].uppercase()

    }
    return letter
}
