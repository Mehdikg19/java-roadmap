/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 05 - Constants & final
 * File        : Example02.java
 * Topic       : final Variable
 * Description : Demonstrate that a final variable cannot be reassigned.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.constantsfinal;

public class Example02 {

    public static void main(String[] args) {

        final int AGE = 25;

        System.out.println("Age : " + AGE);

        // AGE = 30;   // Compile-time Error

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Age : 25
 * ============================================================================
 */