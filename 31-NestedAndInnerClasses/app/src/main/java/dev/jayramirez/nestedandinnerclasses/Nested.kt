package dev.jayramirez.nestedandinnerclasses

/**
 * Nested Class: Class which is created inside another class
 *
 * In Kotlin, a nested class is by default 'static', so its data members and member
 * functions can be accessed without creating an object of the class.
 *
 * Nested classes cannot access the data members of outer classes.
 *
 */

class OuterClass {
    //outer class code
    private var name: String = "Mr X"

    class NestedClass {
        var description: String = "code inside nested class"

        private var id: Int = 101

        fun foo(){
            //print("Name is $name")// error -> Cannot access the outer class member
            print("Id is: $id")
        }
    }

}


fun main() {
    println(OuterClass.NestedClass().description)

    var obj = OuterClass.NestedClass()
    obj.foo()
}