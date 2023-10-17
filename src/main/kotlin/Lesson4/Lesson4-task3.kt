fun main () {

    val todaysWeather: Boolean = true
    val tentToday: Boolean = true
    val airHumidity: Int = 20
    val currentSeason: String = "Зима"
    val comparisonResult = (tentToday == TODAYS_WEATHER) && (tentToday == TENT_TODAY) && (airHumidity == AIR_HUMIDITY) && (currentSeason == CURRENT_SEASON)
        println("Благоприятные ли условия сейчас для роста бобовых? $comparisonResult")
}
const val TODAYS_WEATHER: Boolean = true
const val TENT_TODAY: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val CURRENT_SEASON: String = "Не зима"