package com.jayramirez.inheritance

// The Class that inherits the features of another
// class is called the Sub class or child class or
// derived class, and the class whose features are
// inherited is called the super class or parent class
// or base class.


//Sub Class Child class or Derived Class of Vehicle
//Super Class, ParentClass, Base Class of Vehicle
open class Car(val name: String, val brand: String){
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if ( amount >0 )
            range += amount
    }

    open fun drive(distance: Double) {
        println("Drove for $distance km.")
    }
}

//Sub Class Child class or derived class of car
class ElectricCar(name: String, brand: String, batteryLife: Double): Car(name, brand) {
    override var range = batteryLife * 5

    override fun drive(distance: Double) {
        println("Drove fro $distance km on electricity")
    }

    fun drive() {
        println("Drove for $range km on electricity")
    }
}

fun main() {
    var myCar = Car("A3", "Audi")
    var eCar = ElectricCar("S-Model", "Tesla", 85.0)


    eCar.extendRange(200.0)
    myCar.drive(200.0)
    eCar.drive(200.0)
    eCar.drive(150.0)
    eCar.drive()
}