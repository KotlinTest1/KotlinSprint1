fun main () {
    println("Решите пример:")
    val numberOne = 2
    val numberTwo = 2
    val responseToCaptcha = readln().toInt()
    if ((numberOne + numberTwo) == responseToCaptcha) {
        println("Добро пожаловать!")
    }
    else  {
        println("Доступ запрещен!")
    }
}

