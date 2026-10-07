/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : this Keyword
 * File       : Example01.java
 * Package    : oopbasics.thiskeyword
 * Description: Demonstrates using this to distinguish an
 *              instance field from a constructor parameter.
 * ============================================================
 */

package oopbasics.thiskeyword;

public class Example01 {

    String name;
    int age;

    Example01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {

        Example01 student = new Example01("Ali", 20);

        student.printInfo();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Name: Ali
 * Age: 20
 */