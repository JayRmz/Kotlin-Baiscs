package dev.jayramirez.whenexpressions

fun main(){
//    When Expression
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Autumn")
            println("Fall")
        }
        4-> println("Winter")
        else -> println("Invalid season")
    }

    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
//        in 12 downTo 2 -> print("Winter")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid season")
    }

    var age = 25
    when(age) {
        in 0..15 -> println("You're too young")
        in 16..17 -> println("You may drive now")
        in 18..20 -> println("You may vote now")
        in 21..150 -> println("Now you may dink in US")
    }

    var x: Any = 13.37f
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is another data type")
    }


}