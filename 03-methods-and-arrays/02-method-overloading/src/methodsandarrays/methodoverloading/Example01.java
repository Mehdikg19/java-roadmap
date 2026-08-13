/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 02-Method Overloading
 * File       : Example01.java
 * Package    : methodsandarrays.methodoverloading
 * Description: Demonstrate method overloading using different
 *              numbers and types of parameters.
 * ============================================================
 */

package methodsandarrays.methodoverloading;

public class Example01 {

    public static int calculate(int a, int b) {
        return a + b;
    }

    public static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static double calculate(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(calculate(10, 20));

        System.out.println(calculate(10, 20, 30));

        System.out.println(calculate(10.5, 20.5));
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 30
 * 60
 * 31.0
 */