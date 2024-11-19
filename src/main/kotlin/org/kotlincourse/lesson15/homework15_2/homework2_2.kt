package org.kotlincourse.lesson15.homework15_2

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


//Для тестирования можно использовать эту заготовку

val ordinalNumbers = listOf(
    "first", "second", "third", "fourth", "fifth",
    "sixth", "seventh", "eighth", "ninth", "tenth",
    "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
    "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
)


class OneString() : Materials() {
    fun test(mat: String) {
        val material = extractMaterial()
        addMaterial(mat)
        material.forEach { addMaterial(it) }
    }
}

class Second(): Materials(){
    fun getList(newmat: List<String>){
        val currentMaterials = extractMaterial()
        val max = maxOf(currentMaterials.size, newmat.size)
        fun smth(a:Int, b: Int ){
            if (a > max){

            }
        }
    }
}

fun main(){
    val a = OneString()
    ordinalNumbers.forEach { a.addMaterial(it) }
    a.test("hui")
    a.printContainer()
}