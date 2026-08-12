/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 01-methods
 * File       : Example02.java
 * Package    : methods.arrays.methods
 * Description: Demonstrates how a method can receive parameters
 *              and return a calculated value.
 * ============================================================
 */

package methods.arrays.methods;

public class Example02
{
    static int calculateSum(int number1, int number2)
    {
        return number1 + number2;
    }

    public static void main(String[] args)
    {
        int sum = calculateSum(10, 20);

        System.out.println("Sum = " + sum);
    }
}

/*
 * ============================
 * Expected Output
 * ============================
 *
 * 30
 *
 */