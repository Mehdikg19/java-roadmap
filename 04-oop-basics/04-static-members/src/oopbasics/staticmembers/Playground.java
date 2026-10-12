/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : Static Members
 * File       : Playground.java
 * Package    : oopbasics.staticmembers
 * Description: Experimenting with static and instance fields.
 * ============================================================
 */

package oopbasics.staticmembers;

public class Playground {

    String name;
    static int count = 0;

    public Playground(String name) {
        this.name = name;
        count++;
    }

    public static void main(String[] args) {

        Playground object1 = new Playground("Ali");
        Playground object2 = new Playground("Sara");

        System.out.println("Initial Names:");
        System.out.println(object1.name);
        System.out.println(object2.name);

        System.out.println();

        System.out.println("Initial Count:");
        System.out.println(Playground.count);

        object1.count = 10;

        System.out.println();

        System.out.println("Count After Modification:");
        System.out.println(Playground.count);
        System.out.println(object2.count);

        object1.name = "Reza";

        System.out.println();

        System.out.println("Names After Modification:");
        System.out.println(object1.name);
        System.out.println(object2.name);
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Initial Names:
 * Ali
 * Sara
 *
 * Initial Count:
 * 2
 *
 * Count After Modification:
 * 10
 * 10
 *
 * Names After Modification:
 * Reza
 * Sara
 */