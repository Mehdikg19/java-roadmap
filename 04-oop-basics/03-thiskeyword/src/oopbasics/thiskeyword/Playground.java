/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : this Keyword
 * File       : Playground.java
 * Package    : oopbasics.thiskeyword
 * Description: Experiments with the this keyword.
 * ============================================================
 */

package oopbasics.thiskeyword;

public class Playground {

    String name;

    Playground(String name) {
        this.name = name;
    }

    /*
     * Experiment 01:
     * Compare direct field access with explicit this.field access.
     */
    void compareAccess() {

        System.out.println("Using name: " + name);
        System.out.println("Using this.name: " + this.name);
    }

    /*
     * Experiment 02:
     * Observe how this refers to the current object.
     */
    void showName() {

        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {

        // Experiment 01
        Playground person = new Playground("Mehdi");

        person.compareAccess();

        System.out.println();

        // Experiment 02
        Playground person1 = new Playground("Ali");
        Playground person2 = new Playground("Sara");

        person1.showName();
        person2.showName();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Using name: Mehdi
 * Using this.name: Mehdi
 *
 * Name: Ali
 * Name: Sara
 */
