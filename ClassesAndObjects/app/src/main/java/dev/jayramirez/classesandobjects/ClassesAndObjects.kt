package dev.jayramirez.classesandobjects

fun main() {
    var newPerson = Person("Jay", "Ramirez")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
}

class Person (firstName: String  = "John", lastName: String = "Doe") {
    init {
        println("Person created with firstName = $firstName and lastName = $lastName")
    }
}