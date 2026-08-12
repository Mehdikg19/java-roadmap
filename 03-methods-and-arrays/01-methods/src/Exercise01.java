/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 01-methods
 * File       : Exercise01.java
 * Package    : methods.arrays.methods
 * Description: Calculates the perimeter of a rectangle using
 *              a method with parameters and a return value.
 * ============================================================
 */

package methods.arrays.methods;

public class Exercise01
{
    static double calculatePerimeter(double length, double width)
    {
        return 2 * (length + width);
    }

    public static void main(String[] args)
    {
        double perimeter = calculatePerimeter(10.5, 5);

        System.out.println("Perimeter = " + perimeter);
    }
}

/*
 * ============================
 * Expected Output
 * ============================
 *
 * Perimeter = 31.0
 *
 */