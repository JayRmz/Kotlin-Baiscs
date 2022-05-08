package dev.jayramirez.nestedandinnerclasses


/**
 * Inner Class: Class which is created inside another class with keyword 'inner'.
 *
 * In other words, we can say that a nested class which is marked as 'inner' is called inner class.
 *
 * Inner class cannot be declared inside interfaces or non-inner nested classes/
 *
 * The advantage of inner class over nested class is that, it's able to access members of it's
 * outer class even when it's private
 *
 */


//Example
class OtherOuterClass {
    private var name: String = "Mr X"

    inner class InnerClass {
        var description: String = "Code inside inner class"
        private var id: Int = 101
        fun foo() {
            println("\nname is $name")
            println("Id is $id")
        }
    }

}
fun main(){
    print(OtherOuterClass().InnerClass().description)
    var obj = OtherOuterClass().InnerClass()
    obj.foo()
}