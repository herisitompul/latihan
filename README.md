# latihan

# Java Interface, Polymorphism, and Enumeration Example

This Java program demonstrates the use of interfaces, polymorphism, and enumerations. The program calculates the area of different shapes and the salary of different types of employees.

## Code Explanation

The program consists of two main parts:

1. Shape Calculator
2. Employee Salary Calculator

### Shape Calculator

The `Shape` interface defines a method `calculateArea()`. The `Circle` and `Rectangle` classes implement this interface, each providing their own implementation of `calculateArea()`. This is an example of polymorphism. The `ShapeType` enumeration lists the types of shapes. The `ShapeCalculatorDriver` class uses these classes and interfaces to create objects and calculate their areas.

### Employee Salary Calculator

The `Employee` interface defines a method `calculateSalary()`. The `FullTimeEmployee`, `PartTimeEmployee`, and `Intern` classes implement this interface, each providing their own implementation of `calculateSalary()`. This is another example of polymorphism. The `EmployeeType` enumeration lists the types of employees. The `EmployeeSalaryCalculatorDriver` class uses these classes and interfaces to create objects and calculate their salaries.

## How to Run

The program can be compiled and run using the provided Makefile. The commands are:

```makefile
javac -d bin driver/Driver1.java
java -cp bin driver.Driver1