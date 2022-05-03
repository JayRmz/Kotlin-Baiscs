package dev.jayramirez.nullables

fun main() {
    var name: String = "Jay"
        //name = null -> Compilation ERROR
    var len = name.length

    var nullableName: String? = "Jay"
//    nullableName = null
    /**
     * if(nullableName != null) {
    var len2 = nullableName.length
    } else {
    null
    }
     */
    var len2 = nullableName?.length

    nullableName?.let{ println(it.length) }


    /**
     * Elvis Operator ?:
     */

    val newName = nullableName ?: "Anonymous"
    println("Name is: $newName")

    /**
     *
     */
    nullableName!!.lowercase()
}