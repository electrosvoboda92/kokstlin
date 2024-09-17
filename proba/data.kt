package ru.webrelab.googledriveintegration

import javax.print.attribute.standard.DialogOwner


val name: String = "Hui"
var age: Int = 15

const val PI = 3.14


var count: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
        else field = 100
    }

val chassis: String = "x069uyru"

val color: String = "Blue"

var distance: Double = 0.0

lateinit var owner: String

const val wheels: Int = 4

val report: Stringby lazy{

}

var tank_value: Double = 0.0
    get() = field
    set(value) {
        if(value > 0) field += value
        else
    }