/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : Constructors
 * File       : Example02.java
 * Package    : oopbasics.constructors
 * Description: Introduction to a parameterized constructor
 * ============================================================
 */

package oopbasics.constructors;

class StudentExample02 {

    String name;
    int age;

    StudentExample02(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void displayInfo() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Age: " + age);
    }
}

public class Example02 {

    public static void main(String[] args) {

        StudentExample02 student1 = new StudentExample02("Ali", 20);

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