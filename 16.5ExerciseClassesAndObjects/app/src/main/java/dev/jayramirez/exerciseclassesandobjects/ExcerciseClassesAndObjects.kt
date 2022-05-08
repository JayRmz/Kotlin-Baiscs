package dev.jayramirez.exerciseclassesandobjects


/**
 * Please create a class called MobilePhone. It should have three primary constructor variables, osName, brand and model.

Use the initializer to print those details.

Create three objects of that class in the Main function.

Examples of phones would be:
Samsung Galaxy S20 Ultra. Here the osName is Android, brand is Samsung, model is Galaxy S20 Ultra
 */
fun main() {
    var samsungS20 = MobilePhone("Android 11", "Samsung", "Galaxy S20 Ultra")
    var iPhone13Pro = MobilePhone("iOS 15", "Apple", "iPhone 13 Pro")
    var huaweiP30 = MobilePhone("Android X", "Hwawei", "P30")
}

class MobilePhone (osName: String = "Android 11", brand: String, model: String) {
    private var battery = 30

    init {
        println("Created a new $model $brand with $osName")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}