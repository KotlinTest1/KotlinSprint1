package lesson3
fun main () {

    var number1 = 5
    var multiplicationTable = """
        
        ${number1 * 1}
        ${number1 * 2}
        ${number1 * 3}
        ${number1* 4}
        ${number1 * 5}
        ${number1 * 6}
        ${number1 * 7}
        ${number1 * 8}
        ${number1 * 9}
        ${number1 * 10}
        
    """.trimIndent()
    println(multiplicationTable)

}