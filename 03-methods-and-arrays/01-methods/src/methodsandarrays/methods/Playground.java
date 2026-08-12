/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 01-methods
 * File       : Playground.java
 * Package    : methods.arrays.methods
 * Description: Provides a space for experimenting with methods,
 *              parameters, return values, and different method
 *              calls.
 * ============================================================
 */

package methodsandarrays.methods;

public class Playground
{
    static int add(int number1, int number2)
    {
        return number1 + number2;
    }

    static int square(int number)
    {
        return number * number;
    }

    static boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    public static void main(String[] args)
    {
        System.out.println("Add = " + add(10, 20));

        System.out.println("Square = " + square(5));

        System.out.println("Is Even = " + isEven(10));
        System.out.println("Is Even = " + isEven(7));
    }
}

/*
 * ============================
 * Expected Output
 * ============================
 *
 * Add = 30
 * Square = 25
 * Is Even = true
 * Is Even = false
 *
 */