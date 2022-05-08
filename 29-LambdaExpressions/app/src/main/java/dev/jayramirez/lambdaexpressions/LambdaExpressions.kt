package dev.jayramirez.lambdaexpressions

//Lambda expression is a function which has no name
//Lambda Expressions and anonymous functions are 'function literals', i.e functions that are not declared, but passed immediately as an expression
//Lambda is defined with curly braces { } which takes variables as a parameter (if any) and a body of a function
//The body of a function is written after the variable (if any) followed by the -> operator
//Syntax: {variable(s)-> body_of_lambda}
fun main() {
    addNumbers(9,4)

    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a+ b}
    println(sum(10,5))

    val shorterSum = {a:Int, b: Int -> println(a + b)}
    shorterSum(11,6)
}

//normal function
fun addNumbers(a:Int, b:Int) {
    val add = a + b
    println(add)
}