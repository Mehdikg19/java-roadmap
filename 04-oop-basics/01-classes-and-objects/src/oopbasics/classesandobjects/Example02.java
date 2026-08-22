/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : Classes and Objects
 * Lesson     : 01 - Classes and Objects
 * File       : Example02.java
 * Package    : oopbasics.classesandobjects
 * Description: Demonstrates creating multiple objects from the
 *              same class and maintaining independent object state.
 * ============================================================
 */

package oopbasics.classesandobjects;

class Books {

    String title;
    int pages;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
    }
}

public class Example02 {

    public static void main(String[] args) {

        Books book1 = new Books();
        Books book2 = new Books();

        book1.title = "Java Programming";
        book1.pages = 500;

        book2.title = "Clean Code";
        book2.pages = 464;

        book1.displayInfo();
        book2.displayInfo();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Title: Java Programming
 * Pages: 500
 * Title: Clean Code
 * Pages: 464
 */