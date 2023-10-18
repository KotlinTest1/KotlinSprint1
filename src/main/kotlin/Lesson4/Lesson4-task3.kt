fun main () {

    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val currentSeason: String = "Зима"
    val comparisonResult = (isSunny == IS_SUNNY) && (isAwningOpen == IS_AWNINGOPEN) && (airHumidity == AIR_HUMIDITY) && (currentSeason == CURRENT_SEASON)
        println("Благоприятные ли условия сейчас для роста бобовых? $comparisonResult")
}
const val IS_SUNNY: Boolean = true
const val IS_AWNINGOPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val CURRENT_SEASON: String = "Осень"