package dev.jayramirez.whileloops

fun main() {
    var x = 1
    while (x <= 10) {
        print("$x")
        if (x != 10) {
            print(", ")
        }
        x++
    }
    println("\nWhile loop is done")

    var oneH = 100
    while (oneH >= 0) {
        print(oneH)
        if (oneH != 0) {
            print(", ")
        }
        oneH -= 2
    }

}