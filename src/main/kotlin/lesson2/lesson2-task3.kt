package lesson2
fun main () {

    var departureTimeHour: Int = 9
    var departureTimeMinute: Int = 39
    val travelTime: Int = 457
    val oneHour = 60
    var travelTimeInHour = travelTime / oneHour
    var travelTimeInMinute = travelTime % oneHour
    var arrivalTimeHour = (departureTimeHour + (departureTimeMinute + travelTime) / 60) % 24
    var arrivalTimeMinute = (departureTimeMinute + travelTime) % 60

    println("$arrivalTimeHour:$arrivalTimeMinute")

}