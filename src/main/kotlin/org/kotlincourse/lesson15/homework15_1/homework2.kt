package org.kotlincourse.lesson15.homework15_1


open class ClassPlace(
    val name: String,
    val ageStudents: String,
    val typeClassPlace: String,
    val countStudent: Int
)

class School(
    name: String,
    ageStudents: String,
    typeClassPlace: String,
    countStudent: Int,
    val countClasses: Int,
    val timeWork: IntRange
) : ClassPlace(name, ageStudents, typeClassPlace, countStudent) {
    fun typePlace() {
        println("This is School")
    }
}

class College(
    name: String,
    ageStudents: String,
    typeClassPlace: String,
    countStudent: Int,
    val countBuilds: Int,
    val typeEducation: String
) : ClassPlace(name, ageStudents, typeClassPlace, countStudent) {
    fun typePlace() {
        println("This is College")
    }
}

open class University(
    name: String,
    ageStudents: String,
    typeClassPlace: String,
    countStudent: Int,
    val countFaculty: Int,
    val typeSpeciality: String
) : ClassPlace(name, ageStudents, typeClassPlace, countStudent) {
    open fun typePlace() {
        println("This is University")
    }
}

class Npi(
    name: String,
    ageStudents: String,
    typeClassPlace: String,
    countStudent: Int,
    countFaculty: Int,
    typeSpeciality: String
) : University(name, ageStudents, typeClassPlace, countStudent, countFaculty, typeSpeciality) {
    override fun typePlace() {
        println("This is NPI")
    }
}
