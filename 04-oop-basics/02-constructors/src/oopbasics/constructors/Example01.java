/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : Constructors
 * File       : Example01.java
 * Package    : oopbasics.constructors
 * Description: Introduction to a no-argument constructor
 * ============================================================
 */

package oopbasics.constructors;

class StudentExample01 {

    String name;
    int age;

    StudentExample01() {
        System.out.println("Student object created.");
    }

    void displayInfo() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Age: " + age);
    }
}

public class Example01 {

    public static void main(String[] args) {

        StudentExample01 student1 = new StudentExample01();

        student1.name = "Ali";
        student1.age = 20;

        student1.displayInfo();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Student object created.
 * Student's Name: Ali
 * Student's Age: 20
 */