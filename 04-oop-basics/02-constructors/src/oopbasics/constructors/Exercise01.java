/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : Constructors
 * File       : Exercise01.java
 * Package    : oopbasics.constructors
 * Description: Practice constructor overloading
 * ============================================================
 */

package oopbasics.constructors;

class Book {

    String title;
    double price;

    Book() {
        title = "Unknown";
        price = 0.0;
    }

    Book(String bookTitle) {
        title = bookTitle;
        price = 0.0;
    }

    Book(String bookTitle, double bookPrice) {
        title = bookTitle;
        price = bookPrice;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class Exercise01 {

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book("Java Basics");
        Book book3 = new Book("Effective Java", 45.0);

        System.out.println("Book 1:");
        book1.displayInfo();

        System.out.println();

        System.out.println("Book 2:");
        book2.displayInfo();

        System.out.println();

        System.out.println("Book 3:");
        book3.displayInfo();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Book 1:
 * Title: Unknown
 * Price: 0.0
 *
 * Book 2:
 * Title: Java Basics
 * Price: 0.0
 *
 * Book 3:
 * Title: Effective Java
 * Price: 45.0
 */