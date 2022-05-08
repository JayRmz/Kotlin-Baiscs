package dev.jayramirez.forloops

fun main() {
    println("\nin Range 1..10")
    for(num in 1..10) {
        print("$num")
    }

    println("\nin Range 1 until 10")
    for (i in 1 until 10){
        print("$i")
    }

    println("\nin Range 10 downto 1")
    for (i in 10 downTo 1){
        print("$i")
    }

    println("\nin Range 10 downto 1, step 2")
    for (i in 10 downTo 1 step 2) {
        print("$i")
    }
}