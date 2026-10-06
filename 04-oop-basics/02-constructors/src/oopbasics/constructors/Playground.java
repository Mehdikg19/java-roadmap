/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : Constructors
 * File       : Playground.java
 * Package    : oopbasics.constructors
 * Description: Experiments with constructors
 * ============================================================
 */

package oopbasics.constructors;

class PlaygroundStudent {

    String name;
    int age;

    PlaygroundStudent() {
        name = "Unknown";
        age = 0;

        System.out.println("No-argument constructor executed.");
    }

    PlaygroundStudent(String studentName) {
        name = studentName;
        age = 0;

        System.out.println("One-parameter constructor executed.");
    }

    PlaygroundStudent(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;

        System.out.println("Two-parameter constructor executed.");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Playground {

    public static void main(String[] args) {

        System.out.println("=== Experiment 1 ===");

        PlaygroundStudent student1 = new PlaygroundStudent();
        student1.displayInfo();

        System.out.println();

        System.out.println("=== Experiment 2 ===");

        PlaygroundStudent student2 = new PlaygroundStudent("Ali");
        student2.displayInfo();

        System.out.println();

        System.out.println("=== Experiment 3 ===");

        PlaygroundStudent student3 = new PlaygroundStudent("Sara", 25);
        student3.displayInfo();

        System.out.println();

        System.out.println("=== Experiment 4 ===");

        PlaygroundStudent student4 = new PlaygroundStudent();
        PlaygroundStudent student5 = new PlaygroundStudent("Mehdi");
        PlaygroundStudent student6 = new PlaygroundStudent("Reza", 30);
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * === Experiment 1 ===
 * No-argument constructor executed.
 * Name: Unknown
 * Age: 0
 *
 * === Experiment 2 ===
 * One-parameter constructor executed.
 * Name: Ali
 * Age: 0
 *
 * === Experiment 3 ===
 * Two-parameter constructor executed.
 * Name: Sara
 * Age: 25
 *
 * === Experiment 4 ===
 * No-argument constructor executed.
 * One-parameter constructor executed.
 * Two-parameter constructor executed.
 */