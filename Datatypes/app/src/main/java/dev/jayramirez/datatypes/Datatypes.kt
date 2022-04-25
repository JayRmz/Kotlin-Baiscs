package dev.jayramirez.datatypes

fun main() {
    // Booleans the type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    // not sunny anymore...
    isSunny = false
    print(isSunny)

    // Characters
    val letterChar = 'A'
    val digitChar = '1'
    print(letterChar +" " +  digitChar)
    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    print(myStr)
    print(firCharInStr)
    print(lastCharInStr)

}