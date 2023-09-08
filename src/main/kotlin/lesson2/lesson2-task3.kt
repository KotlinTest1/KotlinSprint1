package lesson2
fun main () {

    var departureTimeHour: Int = 9
    var departureTimeMinute: Int = 39
    val separation: String = ":"
    var travelTime: Int = 457
    var oneHour = 60
    var travelTimeInHour = travelTime / oneHour
    var travelTimeInMinute = travelTime % oneHour
    var arrivalTimeHour = departureTimeHour + travelTimeInHour
    var arrivalTimeMinute = departureTimeMinute + 6
    print(arrivalTimeHour)
    print(separation)
    print(arrivalTimeMinute)

}