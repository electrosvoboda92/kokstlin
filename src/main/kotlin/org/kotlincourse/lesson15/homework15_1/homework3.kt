package org.kotlincourse.lesson15.homework15_1

open class Furniture(
    val countLegs: Int,
    val material: String,
    val typeFurniture: String
)

open class Table(
    countLegs: Int,
    material: String,
    typeFurniture: String,
    val base: String
): Furniture( countLegs, material, typeFurniture)

class Sofa(
    countLegs: Int,
    material: String,
    typeFurniture: String,
    val countSite: Int
): Furniture(countLegs, material, typeFurniture)

class Desk(
    countLegs: Int,
    material: String,
    typeFurniture: String,
    base: String
): Table(countLegs, material, typeFurniture, base)