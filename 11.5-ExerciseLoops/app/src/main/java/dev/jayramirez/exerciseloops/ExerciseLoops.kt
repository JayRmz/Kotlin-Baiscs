package dev.jayramirez.exerciseloops

/**
 *
 * 1. Write a for loop that runs from 0 to 10000
        Once it's at 9001 it should write "IT'S OVER 9000!!!"

    2. Write a while loop that checks the humidity (not the humidityLevel).
        The variable humidityLevel starts at 80.
        The variable humidity is initialized with "humid".
        If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
        Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"
 */
fun main() {
    // 1.
    for(i in 0..10000){
        if (i == 9001){
            print("IT'S OVER 9000!!!")
        }
    }

    //2.
    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid") {

        humidityLevel -= 5
        print("\nhumidity decreased $humidityLevel")
        if (humidityLevel <= 60) {
            println("it's comfy now")
            humidity = "comfy"
        }

    }
}