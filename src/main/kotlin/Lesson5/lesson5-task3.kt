fun main () {

    val theFirstWinningNumber = 3
    val theSecondWinningNumber = 42
        println("Введите первое число:")
    val firstNumber = readln().toInt()
        println("Введите второе число:")
    val secondNumber = readln().toInt()
        if (firstNumber == theFirstWinningNumber && secondNumber == theSecondWinningNumber) println("Поздравляем! Вы выиграли главный приз!")
        else if (firstNumber == theSecondWinningNumber || secondNumber == firstNumber ) println("Поздравляем! Вы выиграли главный приз!")
        else if (firstNumber == theFirstWinningNumber || secondNumber == theSecondWinningNumber) println("Вы выиграли утешительный приз!")
        else if (firstNumber == theSecondWinningNumber || secondNumber == theFirstWinningNumber) println("Вы выиграли утешительный приз!")
        else println("Неудача!")
    println("Для победы необходимы числа: $theFirstWinningNumber,$theSecondWinningNumber")
}