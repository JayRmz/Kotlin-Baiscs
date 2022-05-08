package dev.jayramirez.scope

fun main(){
    myFunction(5)
    // println("bis $b") -> Scope doesn't allow to use variable outside { }
}

//a is a parameter
fun myFunction(a: Int) {
    //a is a variable
    var a = a
    var b = a
    println("a is $a")
    println("b is $b")
}