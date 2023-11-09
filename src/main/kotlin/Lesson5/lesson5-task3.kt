fun main () {

    val theFirstWinningNumber = 3
    val theSecondWinningNumber = 42
        println("Введите первое число:")
    val firstNumber = readln().toInt()
        println("Введите второе число:")
    val secondNumber = readln().toInt()
        if (firstNumber == theFirstWinningNumber && secondNumber == theSecondWinningNumber || firstNumber == theSecondWinningNumber && secondNumber == theFirstWinningNumber) println("Поздравляем! Вы выиграли главный приз!")
        else if (firstNumber == theFirstWinningNumber || firstNumber == theSecondWinningNumber || secondNumber == theFirstWinningNumber || secondNumber == theSecondWinningNumber) println("Вы выиграли утешительный приз!")
        else println("Неудача!")
    println("Для победы необходимы числа: $theFirstWinningNumber,$theSecondWinningNumber")
}