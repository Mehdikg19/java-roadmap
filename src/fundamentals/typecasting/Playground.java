/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 03 - Type Casting
 * File        : Playground.java
 * Topic       : Type Casting Experiments
 * Description : Personal experiments with Java type casting.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.typecasting;

public class Playground {

    public static void main(String[] args) {

        // =====================================================
        // Experiment 1 : Different Numeric Types
        // =====================================================

        double number = 45.89;

        int intValue = (int) number;
        float floatValue = (float) number;
        long longValue = (long) number;

        System.out.println("number = " + number);
        System.out.println("intValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("longValue = " + longValue);

        System.out.println();

        // =====================================================
        // Experiment 2 : Character to Integer
        // =====================================================

        char letter = 'B';
        int asciiCode = letter;

        System.out.println("letter = " + letter);
        System.out.println("asciiCode = " + asciiCode);

        System.out.println();

        // =====================================================
        // Experiment 3 : Overflow Example
        // =====================================================

        byte overflow = (byte) 130;

        System.out.println("overflow = " + overflow);

        System.out.println();

        // =====================================================
        // Experiment 4 : Casting Before vs After Division
        // =====================================================

        int a = 5;
        int b = 2;

        System.out.println("a / b = " + (a / b));
        System.out.println("(double)a / b = " + ((double) a / b));
        System.out.println("a / (double)b = " + (a / (double) b));
        System.out.println("(double)(a / b) = " + ((double) (a / b)));

    }
}

/*
 * ============================================================================
 * Notes
 * ============================================================================
 * 1. Explicit casting removes the fractional part.
 * 2. char can be converted to its Unicode/ASCII integer value.
 * 3. Overflow occurs when a value exceeds the target type range.
 * 4. Casting before an operation changes the calculation.
 * 5. Casting after an operation changes only the result type.
 * ============================================================================
 */