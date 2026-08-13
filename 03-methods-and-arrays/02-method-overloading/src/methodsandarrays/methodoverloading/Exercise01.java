/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 02-Method Overloading
 * File       : Exercise01.java
 * Package    : methodsandarrays.methodoverloading
 * Description: Practice method overloading using different
 *              parameter types and parameter counts.
 * ============================================================
 */

package methodsandarrays.methodoverloading;

public class Exercise01 {

    public static int calculate(int a, int b) {
        return a + b;
    }

    public static double calculate(double a, double b) {
        return a + b;
    }

    public static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(calculate(10, 20));
        System.out.println(calculate(10.5, 20.5));
        System.out.println(calculate(10, 20, 30));
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 30
 * 31.0
 * 60
 */