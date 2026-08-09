/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 03 - Type Casting
 * File        : Example02.java
 * Topic       : Explicit (Narrowing) Casting
 * Description : Manual conversion from double to int.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.typecasting;

public class Example02 {

    public static void main(String[] args) {

        double price = 99.99;
        int result = (int) price;

        System.out.println("price = " + price);
        System.out.println("result = " + result);
    }
}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * price = 99.99
 * result = 99
 * ============================================================================
 */