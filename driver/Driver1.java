package driver;
import model.Employee;
import model.EmployeeType;
import model.FullTimeEmployee;
import model.Intern;
import model.PartTimeEmployee;


public class Driver1 {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(5000);
        Employee partTimeEmployee = new PartTimeEmployee(20, 80);
        Employee intern = new Intern(1000);

        printSalary(fullTimeEmployee, EmployeeType.FULL_TIME);
        printSalary(partTimeEmployee, EmployeeType.PART_TIME);
        printSalary(intern, EmployeeType.INTERN);
    }

    public static void printSalary(Employee employee, EmployeeType employeeType) {
        System.out.println("The salary of the " + employeeType + " employee is: " + employee.calculateSalary());
    }
}