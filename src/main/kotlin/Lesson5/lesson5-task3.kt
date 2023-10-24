fun main () {

    val theFirstWinningNumber = 3
    val theSecondWinningNumber = 42
        println("Введите первое число:")
    val firstNumber = readln().toInt()
        println("Введите второе число:")
    val secondNumver = readln().toInt()
        if (firstNumber == theFirstWinningNumber && secondNumver == theSecondWinningNumber) println("Поздравляем! Вы выиграли главный приз!")
        else if (firstNumber == theFirstWinningNumber || secondNumver == theSecondWinningNumber) println("Вы выиграли утешительный приз!")
        else println("Неудача!")
    println("Для победы необходимы числа: 3,42")
}