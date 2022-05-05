package dev.jayramirez.dataclasses

data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Jay")
//    val name = user1.name
//    println(name)
    user1.name = " Juan "
    val user2 = User(1, "Jay")

    println(user1 == user2)
    println("User Details: $user1")
    val updatedUser = user1.copy(name= "Jay Ramirez")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) //prints 1
    println(updatedUser.component2()) //prints Jay Ramirez
    val(id, name) = updatedUser // Kotlin destructuring
}