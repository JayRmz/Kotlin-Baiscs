package dev.jayramirez.membervariables

fun main() {
    var jay = Person("Jay", "Ramirez", 25)
    jay.stateHobby()
    
    var john = Person()
    john.hobby = "Watch netflix"
    john.stateHobby()

    var denis = Person(firstName = "Denis")
}

class Person(firstName: String = "John", lastName: String = "Doe" ) {
    //Member Variables - Properties
    var age : Int? = null
    var hobby: String = "code all day"
    var firstName: String? = null


    init {
        this.firstName = firstName
        println("Created a new person with firstName = $firstName and lastName = $lastName")
    }

    constructor(firstName: String, lastName: String, age: Int) : this (firstName, lastName) {
        this.age = age

    }

    //Member functions - Methods
    fun stateHobby() {
        println("$firstName\'s hobbiy is $hobby")
    }
}