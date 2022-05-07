package dev.jayramirez.typecasting

fun main() {
    val stringList: List<String> = listOf("Ramirez", "Jay", "Michael", "Garry")

    val mixedTypeList: List<Any> = listOf("Jay", 5, 7, "BDay", 90.5, "weights", "kg" )

    for(value in mixedTypeList) {
        if( value is Int) {
            println("Integer: '$value'")
        } else if( value is Double) {
            println("Double: '$value' with floor value of ${Math.floor(value)}")
        } else if (value is String) {
            println("String: '$value' of lenght ${value.length}")
        } else {
            println("Unknow type")
        }
    }


    for(value in mixedTypeList) {
        when (value) {
            is Int -> {
                println("Integer: '$value'")
            }
            is Double -> {
                println("Double: '$value' with floor value of ${Math.floor(value)}")
            }
            is String -> {
                println("String: '$value' of lenght ${value.length}")
            }
            else -> {
                println("Unknow type")
            }
        }
    }

    //Smart cast
    val obj1: Any = "I have a dream"
    if(obj1 !is String) {
        println("Not a String")
    } else {
        //obj is automatically cast to a String in ths scope
        println("Found a String of lenght ${obj1.length}")
    }

    //Explicit (unsafe) Casting using the 'as' keyword - can go wrong
    val str1: String = obj1 as String
    println(str1.length)

//    val obj2: Any = 1337
//    val str2: String = obj2 as String
//    println(str2)


    //Explicit (safe) casting using 'as?' keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String
    println(str3) // null

}