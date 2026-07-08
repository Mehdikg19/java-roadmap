/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 05 - Constants & final
 * File        : Playground.java
 * Topic       : Exploring final
 * Description : Experiments with final variables.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.constantsfinal;

public class Playground {

    public static void main(String[] args) {

        // =====================================================
        // Experiment 1 : Delayed Initialization
        // =====================================================

        final int AGE;

        AGE = 25;

        System.out.println("Experiment 1 : " + AGE);

        System.out.println();

        // =====================================================
        // Experiment 2 : Multiple Assignment
        // =====================================================

        /*
        final int NUMBER;

        NUMBER = 10;
        NUMBER = 20;

        // Compile-time Error
        */

        System.out.println("Experiment 2 : See commented code.");

        System.out.println();

        // =====================================================
        // Experiment 3 : Initialization Inside if(true)
        // =====================================================

        final int VALUE;

        if (true) {
            VALUE = 100;
        }

        System.out.println("Experiment 3 : " + VALUE);

        System.out.println();

        // =====================================================
        // Experiment 4 : Conditional Initialization
        // =====================================================

        /*
        final int SCORE;

        if (Math.random() > 0.5) {
            SCORE = 100;
        }

        System.out.println(SCORE);

        // Compile-time Error
        */

        System.out.println("Experiment 4 : See commented code.");

    }

}

/*
 * ============================================================================
 * Expected Observations
 * ============================================================================
 * Experiment 1
 * - A final variable may be initialized after declaration,
 *   but only once.
 *
 * Experiment 2
 * - Reassigning a final variable causes a compile-time error.
 *
 * Experiment 3
 * - The compiler accepts if(true) because VALUE is guaranteed
 *   to be initialized.
 *
 * Experiment 4
 * - The compiler rejects the code because SCORE may not be
 *   initialized before use.
 * ============================================================================
 */