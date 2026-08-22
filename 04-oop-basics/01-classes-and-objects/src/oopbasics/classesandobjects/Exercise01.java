/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : Classes and Objects
 * Lesson     : 01 - Classes and Objects
 * File       : Exercise01.java
 * Package    : oopbasics.classesandobjects
 * Description: Creates a Student object, sets its state, and
 *              displays the student's information.
 * ============================================================
 */

package oopbasics.classesandobjects;

class Student {

    String name;
    int age;

    void displayInfo() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Age: " + age);
    }
}

public class Exercise01 {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Ali";
        student1.age = 20;

        student1.displayInfo();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Student's Name: Ali
 * Student's Age: 20
 */