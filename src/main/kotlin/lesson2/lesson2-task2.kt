package lesson2
fun main () {

    var companyEmployees = 50
    var salary: Int = 30000
    var interns = 30
    var salaryInterns = 20000
    var staff = companyEmployees + interns
    var salaryCompanyEmployees = companyEmployees * salary
    var expenses = (interns * salaryInterns) + salaryCompanyEmployees
    var averageSalary = expenses / staff
    println(averageSalary)

}