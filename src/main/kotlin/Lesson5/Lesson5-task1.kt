fun main () {

    val numberOne = readln().toInt()
    val numberTwo = readln().toInt()
    val responseToCaptcha = numberOne + numberTwo

    if ((numberOne + numberTwo) == responseToCaptcha) {
        println("Добро пожаловать!")
    }
    else  {
        println("Доступ запрещен!")
    }
}

