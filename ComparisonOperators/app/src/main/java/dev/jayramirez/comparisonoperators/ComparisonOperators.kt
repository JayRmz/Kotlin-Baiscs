package dev.jayramirez.comparisonoperators

//Comparison Operators (==, !=, <, >, <=, >=)
fun main(){
//    == -> Is Equal
    println("\nIs Equal: ")
    var isEqual = 5==3
    print(isEqual)
    isEqual = 5==5
    print(isEqual)

//    != -> Is Not Equal
    println("\nIs Not Equal: ")
    var isNotEqual = 5 != 3
    print(isNotEqual)
    isNotEqual = 5 != 5
    print(isNotEqual)

//    < -> Is Lower than
    println("\nIs lower Than: ")
    var isLowerThan = 5 < 3
    print(isLowerThan)
    isLowerThan = 5 < 5
    print(isLowerThan)

    //    > -> Is Greater than
    println("\nIs greater Than: ")
    var isGreaterThan = 5 > 3
    print(isGreaterThan)
    isGreaterThan = 5 > 5
    print(isGreaterThan)

    //    <= -> Is Lower or equal than
    println("\nIs lower or equal Than: ")
    var isLowerEqualThan = 5 < 3
    print(isLowerEqualThan)
    isLowerEqualThan = 5 < 5
    print(isLowerEqualThan)

    //    >= -> Is Greater or equal than
    println("\nIs greater or equal Than: ")
    var isGreaterEqualThan = 5 > 3
    print(isGreaterEqualThan)
    isGreaterEqualThan = 5 > 5
    print(isGreaterEqualThan)
}