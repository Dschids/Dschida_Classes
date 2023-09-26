fun main(args: Array<String>) {
    // create 3 instances of class Employee for 3 different employees
    var emp1 = Employee("Johny Box O Donuts", 1, 3)
    var emp2 = Employee("Susie Creamcheese", 2, 1)
    var emp3 = Employee("Joe Shmo", 3, 2)
    // print off all information for each employee
    emp1.printAll()
    println()
    emp2.printAll()
    println()
    emp3.printAll()
}