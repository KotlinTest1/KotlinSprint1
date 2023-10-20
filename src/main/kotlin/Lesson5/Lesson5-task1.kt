fun main () {

    val userAuthorization = 4

    if (userAuthorization == USER_RESPONSE) {
        println("Добро пожаловать!")
    }
    if (userAuthorization != USER_RESPONSE) {
        println("Доступ запрещен!")
    }

}
const val USER_RESPONSE = 4