/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : this Keyword
 * File       : Exercise01.java
 * Package    : oopbasics.thiskeyword
 * Description: Demonstrates using this to initialize instance
 *              fields from constructor parameters.
 * ============================================================
 */

package oopbasics.thiskeyword;

public class Exercise01 {

    String name;
    int age;

    Exercise01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Exercise01 student = new Exercise01("Sara", 25);

        student.printInfo();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Name: Sara
 * Age: 25
 */