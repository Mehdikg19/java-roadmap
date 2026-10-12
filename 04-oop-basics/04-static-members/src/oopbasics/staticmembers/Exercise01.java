/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : Static Members
 * File       : Exercise01.java
 * Package    : oopbasics.staticmembers
 * Description: Demonstrating static and instance members.
 * ============================================================
 */

package oopbasics.staticmembers;

public class Exercise01 {

    String name;
    static int studentCount = 0;

    public Exercise01(String name) {
        this.name = name;
        studentCount++;
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public static void displayStudentCount() {
        System.out.println("Student Count: " + studentCount);
    }

    public static void main(String[] args) {

        Exercise01 student1 = new Exercise01("Ali");
        Exercise01 student2 = new Exercise01("Sara");
        Exercise01 student3 = new Exercise01("Reza");

        student1.displayName();
        student2.displayName();
        student3.displayName();

        Exercise01.displayStudentCount();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Student Name: Ali
 * Student Name: Sara
 * Student Name: Reza
 * Student Count: 3
 */