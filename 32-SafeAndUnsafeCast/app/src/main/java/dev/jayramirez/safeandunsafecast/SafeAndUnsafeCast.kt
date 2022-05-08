package dev.jayramirez.safeandunsafecast

/**
 * Unsafe cast operator: as
 *
 * Sometimes it is not possible to cast a variable and it throws an exception,
 * this is called an 'unsafe cast'
 *
 * The unsafe cast is performed by the infix operator 'as'
 */

// Example

/**
 * A nullable (String?) can't be cast to non nullable string (String),
 * this throws an exception
 *
 * fun main(){
 *  val obj:Any? = null
 *  val str: String = obj as String
 *  println(str)
 * }
 */

// This works!
//fun main() {
//    val obj: Any? = "String unsafe Cast"
//    val str: String? = obj as String?
//    println(str)
//}


/***
 * Safe cast operator: as?
 *
 * 'as?' provides a safe cast operation to safely cast to a type.
 *
 * It return a null if casting is not possible, rather tha throwing an exception.
 */

//Example
fun main() {
    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString) //Kotlin
    println(safeInt) //null
}