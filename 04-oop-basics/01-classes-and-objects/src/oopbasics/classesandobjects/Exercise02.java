/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : Classes and Objects
 * Lesson     : 01 - Classes and Objects
 * File       : Exercise02.java
 * Package    : oopbasics.classesandobjects
 * Description: Creates multiple Car objects, assigns
 *              independent state to each object, and
 *              displays their information.
 * ============================================================
 */

package oopbasics.classesandobjects;

class Car {

    String brand;
    int year;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class Exercise02 {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Toyota";
        car1.year = 2020;

        car2.brand = "BMW";
        car2.year = 2024;

        car1.displayInfo();
        car2.displayInfo();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Brand: Toyota
 * Year: 2020
 * Brand: BMW
 * Year: 2024
 */