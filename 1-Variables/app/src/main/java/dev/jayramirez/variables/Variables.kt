package dev.jayramirez.variables

// fun main it's the start of a Kotlin App
fun main() {
    val name = "Jay"
//    name = "Something else" -> Error 'val' cant be modified.
    var lastName = "Juan"
    lastName = "Ramirez"
    print("My name is: " + name + " " + lastName )
}