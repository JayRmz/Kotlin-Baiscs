package dev.jayramirez.gettersandsetters

import java.lang.IllegalArgumentException

fun main() {
    var myCar = Car()
    // myCar.owner // Error -> Not initialized
    println("Brand is: ${myCar.myBrand}")
    println("Max Speed is: ${myCar.maxSpeed}")
    myCar.maxSpeed = 200
    println("Max Speed is: ${myCar.maxSpeed}")


    var anotherCar = Car()
    //    anotherCar.maxSpeed = -1 // Error -> IllegalArgumentException
    println("Model : ${anotherCar.myModel}")
//    anotherCar.myModel = "M3"
//    println("Model : ${anotherCar.myModel}")
}

class Car() {
    //lateinit -> It will initialize later on
    lateinit var owner: String
    val myBrand: String = "BMW"
        get() {
            return field.lowercase()
        }

    var maxSpeed: Int = 250
        get() = field
        set(value) {
            field = if(value > 0 ) value else throw  IllegalArgumentException("Maxspeed can't be lower than 0")
        }


    var myModel : String = "M5"
        private set

    init {
        this.owner = "Franck"
    }
}