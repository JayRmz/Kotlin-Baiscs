package dev.jayramirez.arrays

fun main () {
    // val numbers: IntArray = intArrayOf(1,2,3,4)
//    val numbers = intArrayOf(1,2,3,4)
    val numbers = arrayOf(1,2,3,4)
//    print(numbers) // print -> [Ljava.lang.Integer;@4b67cf4d
//    print(numbers.contentToString()) //print -> [1,2,3,4]
//    for(element in numbers) {
//        println("\nelement: $element + 2 = ${element + 2} ")
//    }
//    print(numbers[0])

    println("Initial Values: ${numbers.contentToString()}")
    numbers[0] = 6
    numbers[1] = 5
    numbers[2] = 2
    println("Modified Values: ${numbers.contentToString()}")

    val days = arrayOf("Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat")
    print(days.contentToString())

    val fruits = arrayOf(Fruit("Banana", 10.0),Fruit("Apple", 1.0), Fruit("Berry", 6.0),)

    for (fruit in fruits) {
        print("\n${fruit.name}")
    }

    for (index in fruits.indices) {
        print("\n${fruits[index].name} is in index $index")
    }


    val mixedArray = arrayOf("Sun", "Mon", 1, 5.0, Fruit("Watermenlon", 15.0))
    print(mixedArray.contentToString())

}

data class Fruit(val name: String, val price: Double)