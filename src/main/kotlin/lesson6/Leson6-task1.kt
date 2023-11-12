fun main() {

    println("Для регистрации введите логин и пароль:")
    val userName = readln()
    val userPassword = readln().toInt()
    println("Для авторизации ввидете логин и пароль:")
    readln().toString()
    readln().toInt()
    do {
        println("Авторизация прошла успешно ${readln() == userName} ${readln().toInt() == userPassword}")

    } while (readln() == userName && readln().toInt() == userPassword)


}