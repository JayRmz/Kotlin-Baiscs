package dev.jayramirez.visibilitymodifiers

/**
 * Visibility Modifiers are categorized into four different types:
 * public: Accessible from everywhere in the project
 * private: Accessible only within the block in which properties, fields, etc. are declared.
 * protected: With a class or an interface allows visibility to its class or subclass only.
 * internal: Makes the field visible only inside the module in which it is implemented.
 */


//EXAMPLE

open class Base() {
    var a = 1 //public by default
    private var b = 2 //private to Base class
    protected open val c = 3 // Visible to the base and the derived Class
    protected fun e(){} //visible to the Base and the derived class
}

class Derived: Base() {
    //a, c, d, and e() of the Base class are visible
    //b is not visible
    override val c = 9 //c is protected
}

fun main() {
    val base = Base()
    //base.a and base.d are visible
    //base.b, base.c and bas.e() are not visible

    val derived = Derived()
    //derived.c is not visible

}