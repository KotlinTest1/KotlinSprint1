 fun main() {

     var bookedToday = 13
     var bookedTomorrow = 9
     var comparisonResult: Boolean = bookedToday < NUMBER_OF_TABLES
     var comparisonResult2: Boolean = bookedTomorrow < NUMBER_OF_TABLES
        println("Доступность столиков на сегодня: $comparisonResult, Доступность столиков на завтра: $comparisonResult2")

}
 const val NUMBER_OF_TABLES = 13