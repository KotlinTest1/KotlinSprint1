fun main () {

    val yearOfBirth = readln().toInt()
    val currentAge = (YEAR_OF_BIRTH - yearOfBirth)
    if (currentAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Главный экран")

}
const val AGE_OF_MAJORITY = 18
const val YEAR_OF_BIRTH = 2023
