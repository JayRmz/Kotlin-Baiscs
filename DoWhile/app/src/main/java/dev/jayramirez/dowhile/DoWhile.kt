package dev.jayramirez.dowhile

fun main() {
    var x = 1
    do{
        print("$x")
        if(x != 10) {
            print(", ")
        }
        x++
    } while (x <= 10)
    println("\nDo while loop is done")


//    Part II.
    var feltTemp = "Cold"
    var roomTemp = 10
    while (feltTemp == "Cold") {
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "Comfy"
            println("It's comfy now")
        }
    }

}