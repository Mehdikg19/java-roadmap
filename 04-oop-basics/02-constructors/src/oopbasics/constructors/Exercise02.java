/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : Constructors
 * File       : Exercise02.java
 * Package    : oopbasics.constructors
 * Description: Practice constructor overloading with Employee
 * ============================================================
 */

package oopbasics.constructors;

class Employee {

    String name;
    int employeeId;
    double salary;

    Employee() {
        name = "Unknown";
        employeeId = 0;
        salary = 0.0;
    }

    Employee(String employeeName) {
        name = employeeName;
        employeeId = 0;
        salary = 0.0;
    }

    Employee(String employeeName, int id, double employeeSalary) {
        name = employeeName;
        employeeId = id;
        salary = employeeSalary;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

public class Exercise02 {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Ali");
        Employee employee3 = new Employee("Sara", 102, 3500.0);

        System.out.println("Employee 1:");
        employee1.displayInfo();

        System.out.println();

        System.out.println("Employee 2:");
        employee2.displayInfo();

        System.out.println();

        System.out.println("Employee 3:");
        employee3.displayInfo();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Employee 1:
 * Name: Unknown
 * Employee ID: 0
 * Salary: 0.0
 *
 * Employee 2:
 * Name: Ali
 * Employee ID: 0
 * Salary: 0.0
 *
 * Employee 3:
 * Name: Sara
 * Employee ID: 102
 * Salary: 3500.0
 */