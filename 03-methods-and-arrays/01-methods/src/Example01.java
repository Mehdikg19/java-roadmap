/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 01-methods
 * File       : Example01.java
 * Package    : methods.arrays.methods
 * Description: Demonstrates how to define and call a simple method.
 * ============================================================
 */

package methods.arrays.methods;

public class Example01
{
    static double calculateArea(double length, double width)
    {
        return length * width;
    }

    public static void main(String[] args)
    {
        double area = calculateArea(10.5, 5);

        System.out.println("Area = " + area);
    }
}

/*
 * ============================
 * Expected Output
 * ============================
 *
 * 52.5
 *
 */