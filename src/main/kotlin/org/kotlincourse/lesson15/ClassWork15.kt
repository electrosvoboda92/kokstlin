package org.kotlincourse.lesson15

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}


class ExtractFirst() : Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()) {
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        for (i in 1 until extracted.size) {
            addMaterial(extracted[i])
        }
        return extracted[0]
    }
}

class ExtractLast() : Materials() {
    fun extract(): String {
        val extractred = extractMaterial()
        if (extractred.isEmpty()) {
            return ""
        }
        if (extractred.size == 1) {
            return extractred[0]
        }
        for (i in 0 until extractred.size - 1) {
            addMaterial(extractred[i])
        }
        return extractred.last()
    }
}

class ExtractMiddle(): Materials(){
    fun extract(): String{
        val extracted = extractMaterial()
        if (extracted.isEmpty()){
            return ""
        }
        if (extracted.size == 1){
            return extracted[0]
        }
        val middleIndex = extracted.size/2
        for (i in extracted.indices){
            if(i == middleIndex) continue
            addMaterial(extracted[i])
        }
        return extracted[middleIndex]
    }
}

fun main() {
    val ordinalsNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth"
    )

    val m1 = ExtractFirst()
    ordinalsNumbers.forEach { m1.addMaterial(it) }
    println(m1.extract())
    m1.printContainer()

    val m2 = ExtractLast()
    ordinalsNumbers.forEach { m2.addMaterial(it) }
    println(m2.extract())
    m2.printContainer()

    val m3 = ExtractMiddle()
    ordinalsNumbers.forEach { m3.addMaterial(it) }
    println(m3.extract())
    m3.printContainer()
}

