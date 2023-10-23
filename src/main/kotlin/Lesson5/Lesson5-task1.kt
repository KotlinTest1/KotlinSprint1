fun main () {

    val numberOne = readln().toInt()
    val numberTwo = readln().toInt()

    if ((numberOne + numberTwo) == USER_RESPONSE) {
        println("Добро пожаловать!")
    }
    else  {
        println("Доступ запрещен!")
    }
}
const val USER_RESPONSE = 4
