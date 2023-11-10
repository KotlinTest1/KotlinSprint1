fun main () {

    val numberOne = 2
    val numberTwo = 2
    println("Решите пример: $numberOne + $numberTwo")
    val responseToCaptcha = readln().toInt()
    if ((numberOne + numberTwo) == responseToCaptcha) {
        println("Добро пожаловать!")
    }
    else  {
        println("Доступ запрещен!")
    }
}

