/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 02-Method Overloading
 * File       : Exercise02.java
 * Package    : methodsandarrays.methodoverloading
 * Description: Practice overload resolution using int, long,
 *              and double parameters.
 * ============================================================
 */

package methodsandarrays.methodoverloading;

public class Exercise02 {

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

        int intNumber = 10;
        long longNumber = 1361;
        float floatNumber = 43.5f;

        display(intNumber);
        display(longNumber);
        display(floatNumber);
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