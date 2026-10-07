/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : this Keyword
 * File       : Example02.java
 * Package    : oopbasics.thiskeyword
 * Description: Demonstrates using this to access the current
 *              object, call instance methods, and chain
 *              constructors using this(...).
 * ============================================================
 */

package oopbasics.thiskeyword;

public class Example02 {

    String name;
    int age;

    /*
     * No-argument constructor.
     * Delegates initialization to the parameterized constructor.
     */
    Example02() {
        this("Unknown", 18);
    }

    /*
     * Parameterized constructor.
     */
    Example02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        System.out.println("Hello, " + this.name);
    }

    void printInfo() {
        this.sayHello();
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {

        Example02 student1 = new Example02();
        Example02 student2 = new Example02("Ali", 20);

        student1.printInfo();

        System.out.println();

        student2.printInfo();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Hello, Unknown
 * Age: 18
 *
 * Hello, Ali
 * Age: 20
 */