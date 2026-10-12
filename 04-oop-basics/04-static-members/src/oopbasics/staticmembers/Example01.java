/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : Static Members
 * File       : Example01.java
 * Package    : oopbasics.staticmembers
 * Description: Introduction to static fields.
 * ============================================================
 */

package oopbasics.staticmembers;

public class Example01 {

    static int employeeCount = 0;

    String name;

    public Example01(String name) {
        this.name = name;
        employeeCount++;
    }

    public static void main(String[] args) {

        Example01 employee1 = new Example01("Ali");
        Example01 employee2 = new Example01("Sara");
        Example01 employee3 = new Example01("Reza");

        System.out.println(employee1.name);
        System.out.println(employee2.name);
        System.out.println(employee3.name);

        System.out.println(Example01.employeeCount);
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Ali
 * Sara
 * Reza
 * 3
 */