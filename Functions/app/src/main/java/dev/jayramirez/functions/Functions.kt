package dev.jayramirez.functions

fun main() {
    myFunction()
    var result = addUp(5, 25)
    println(result)

    var newResult = avgOfTwoVals(5.0, 25.3)
    println(newResult)
}

fun myFunction() {
    println("Called from  MyFunction")
}

/**
 * Function Name: addUp
 * Parameters: a: Int, b: Int
 * return: Int
 */
fun addUp(a: Int, b:Int) : Int {
   return a+b
}

fun avgOfTwoVals(a: Double, b: Double): Double {
    return (a+b)/2
}