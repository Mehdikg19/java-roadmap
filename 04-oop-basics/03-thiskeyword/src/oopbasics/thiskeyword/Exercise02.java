/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : this Keyword
 * File       : Exercise02.java
 * Package    : oopbasics.thiskeyword
 * Description: Demonstrates constructor chaining with
 *              this(...), field access with this, and
 *              instance method invocation with this.
 * ============================================================
 */

package oopbasics.thiskeyword;

public class Exercise02 {

    String name;
    int age;

    Exercise02() {
        this("Unknown", 18);
    }

    Exercise02(String name, int age) {
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

        Exercise02 person1 = new Exercise02();
        Exercise02 person2 = new Exercise02("Ali", 20);

        person1.printInfo();

        System.out.println();

        person2.printInfo();
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