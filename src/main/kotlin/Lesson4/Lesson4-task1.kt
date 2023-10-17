 fun main() {

     val bookedToday = 13
     var bookedTomorrow = 9
        println("Доступность столиков на сегодня: ${bookedToday < NUMBER_OF_TABLES} Доступность столиков на завтра: ${bookedTomorrow < NUMBER_OF_TABLES} ")
 }

 const val NUMBER_OF_TABLES = 13