fun main () {

    val yearOfBirth = 2019
    val currentYear = 2023
    val currentAge = currentYear - yearOfBirth
    if (currentAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else if (yearOfBirth < YEAR_OF_BIRTH)println("Показать экран со скрытым контентом")
    else println("Главный экран")

}
const val AGE_OF_MAJORITY = 18
const val YEAR_OF_BIRTH = 2023
