/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 03 - Type Casting
 * File        : Example01.java
 * Topic       : Implicit (Widening) Casting
 * Description : Automatic conversion from int to double.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.typecasting;

public class Example01 {

    public static void main(String[] args) {

        int number = 25;
        double result = number;

        System.out.println("number = " + number);
        System.out.println("result = " + result);
    }
}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * number = 25
 * result = 25.0
 * ============================================================================
 */