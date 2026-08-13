/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 02-Method Overloading
 * File       : Example02.java
 * Package    : methodsandarrays.methodoverloading
 * Description: Demonstrate method overloading with different
 *              parameter types and primitive widening.
 * ============================================================
 */

package methodsandarrays.methodoverloading;

public class Example02 {

    public static void display(int number) {
        System.out.println("int");
    }

    public static void display(long number) {
        System.out.println("long");
    }

    public static void display(double number) {
        System.out.println("double");
    }

    public static void main(String[] args) {

        display(10);
        display(10L);
        display(10.5);
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * int
 * long
 * double
 */