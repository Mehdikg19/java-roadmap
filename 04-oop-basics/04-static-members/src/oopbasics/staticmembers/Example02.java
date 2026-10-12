/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : Static Members
 * File       : Example02.java
 * Package    : oopbasics.staticmembers
 * Description: Comparing static and instance methods.
 * ============================================================
 */

package oopbasics.staticmembers;

public class Example02 {

    static int employeeCount = 0;

    String name;

    public Example02(String name) {
        this.name = name;
        employeeCount++;
    }

    public void displayName() {
        System.out.println("Employee name: " + name);
    }

    public static void displayEmployeeCount() {
        System.out.println("Total employees: " + employeeCount);
    }

    public static void main(String[] args) {

        Example02 employee1 = new Example02("Ali");
        Example02 employee2 = new Example02("Sara");

        employee1.displayName();
        employee2.displayName();

        Example02.displayEmployeeCount();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Employee name: Ali
 * Employee name: Sara
 * Total employees: 2
 */