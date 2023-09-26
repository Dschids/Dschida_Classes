// constructor creates variables for employee name, employee number, and employee shift
class Employee (var employeeName: String,
                var employeeNumber: Int,
                var employeeShift: Int) {
    // printAll prints off all information in the class
    fun printAll(){
        println("Employee Name: $employeeName")
        println("Emplyee Number: $employeeNumber")
        println("Employee Shift: $employeeShift")
    }
}