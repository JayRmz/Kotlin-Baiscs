package dev.jayramirez.abstractclasses


/**
 * An abstract class acnnot be instantiates
 * (you can't create objects of an abstract class).
 * However, you can inherit sub classes from an abstract class.
 * The members (properties an methods) of an abstract class are non-abstract
 * unless you explicitly use the abstract keyword to make them abstract.
 */
abstract class Mammal (private val name: String, private val origin: String, private val weight: Double){ // Concrete Properties

    //Abstract property (Must be overridden by subclasses)
    abstract var maxSpeed: Double

    // Abstract methods (Must be implemented by subclasses
    abstract fun run()
    abstract fun breath()

    //concrete Nun abstract methods
    fun displayDetails(){
        println("Name: $name, Origin: $origin")
    }
}


class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on two legs")
    }

    override fun breath() {
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through trunk")
    }
}


fun main() {
    val human = Human("Jay", "Mex", 100.0, 5.0)
    val elephant = Elephant("Rosy", "India", 5400.0, 25.0)

    //val mammal = Mammal()  | Error-> Can;t create an instance of Mammal

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}