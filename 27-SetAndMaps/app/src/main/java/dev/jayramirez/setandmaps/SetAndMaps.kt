package dev.jayramirez.setandmaps

fun main(){
    val fruits = setOf("Orange", "Apple", "Grape", "Apple")
    print(fruits.size) // 3 -> It only returns unique values

    print(fruits.toSortedSet())

    val mutableFruits = fruits.toMutableList()
    mutableFruits.add("Watermelon")
    mutableFruits.add("Pear")
    print(mutableFruits.elementAt(3)) // Watermelon


    //Dictionary equivalent
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    print(daysOfTheWeek[2])

    for(key in daysOfTheWeek.keys) {
        print("\n$key is to ${daysOfTheWeek[key]}")
    }


    val fruitsMap = mapOf("Fav" to Fruit("Grape", 2.5), "Ok" to Fruit("Apple", 5.0))

    for(key in fruitsMap.keys) {
        print("\n$key is to ${fruitsMap[key]}")
    }

    val newDays = daysOfTheWeek.toMutableMap()
    newDays[4] = "Thurs"
    newDays[5] = "Fri"

    print(newDays.toSortedMap())

}


data class Fruit(val name: String, val price: Double)