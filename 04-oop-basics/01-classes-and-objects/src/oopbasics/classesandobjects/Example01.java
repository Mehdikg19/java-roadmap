/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : Classes and Objects
 * Lesson     : 01 - Classes and Objects
 * File       : Example01.java
 * Package    : oopbasics.classesandobjects
 * Description: Demonstrates the basic relationship between a
 *              class, an object, instance variables, and a method.
 * ============================================================
 */

package oopbasics.classesandobjects;

class Book {

    String title;
    int pages;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
    }
}

public class Example01 {

    public static void main(String[] args) {

        Book book1 = new Book();

        book1.title = "Java Programming";
        book1.pages = 500;

        book1.displayInfo();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Title: Java Programming
 * Pages: 500
 */