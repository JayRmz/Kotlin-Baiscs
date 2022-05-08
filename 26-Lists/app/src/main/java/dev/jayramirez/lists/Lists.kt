package dev.jayramirez.lists

fun main() {
    val months = listOf("Jan", "Feb", "Mar")
    val anyTypes = listOf(1,2,3, false, true, "String")
//    print(anyTypes.size)
//    print(months[1])

    val mutableMonths = months.toMutableList()
    val newMonthsList = arrayOf("Apr", "May", "Jun")
    mutableMonths.addAll(newMonthsList)
    mutableMonths.add("Jul")

    val missingMonths = arrayOf("Aug", "Sep", "Oct", "Nov", "Dec")
    mutableMonths.addAll(missingMonths)
    print(mutableMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thurs")
    println(days)

    days[2] = "Sun"
    println(days)

    days.removeAt(3)
    println(days)

    val removeList = mutableListOf<String>("Mon", "Tue")
    days.removeAll(removeList)
    println(days)

    days.removeAll(days)
    print(days)
}