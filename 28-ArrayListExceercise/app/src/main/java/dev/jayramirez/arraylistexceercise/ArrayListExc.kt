package dev.jayramirez.arraylistexceercise


/**
 * Write a program that adds five Numbers (Double)
 * to an arrayList and then calculates the average of those numbers.
 * Use a for (in) loop in this exercise.
 */

fun main() {
    val arrayList = arrayListOf<Double>()

    arrayList.add(1.0)
    arrayList.add(2.0)
    arrayList.add(3.0)
    arrayList.add(4.0)
    arrayList.add(5.0)

    print(arrayList)
    var sum = 0.0
    for(element in  arrayList) {
        sum += element
    }
    var avg = sum/arrayList.size
    print(avg)
}

