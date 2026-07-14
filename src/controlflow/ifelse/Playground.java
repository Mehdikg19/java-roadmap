/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 02 - Control Flow
 * File        : Playground.java
 * Topic       : Exploring if-else
 * Description : Experiments with the if-else statement.
 * Author      : Mehdi
 * ============================================================================
 */

package controlflow.ifelse;

public class Playground {

    public static void main(String[] args) {

        // =====================================================
        // Experiment 1 : Zero Value
        // =====================================================

        int number = 0;

        if (number > 0) {

            System.out.println("Positive");

        } else {

            System.out.println("Not Positive");

        }

        System.out.println();

        // =====================================================
        // Experiment 2 : Negative Value
        // =====================================================

        number = -5;

        if (number > 0) {

            System.out.println("Positive");

        } else {

            System.out.println("Not Positive");

        }

        System.out.println();

        // =====================================================
        // Experiment 3 : Positive Value
        // =====================================================

        number = 25;

        if (number > 0) {

            System.out.println("Positive");

        } else {

            System.out.println("Not Positive");

        }

    }

}

/*
 * ============================================================================
 * Expected Observations
 * ============================================================================
 * Experiment 1
 * - number is 0.
 * - The condition (number > 0) is false.
 * - "Not Positive" is printed.
 *
 * Experiment 2
 * - number is -5.
 * - The condition (number > 0) is false.
 * - "Not Positive" is printed.
 *
 * Experiment 3
 * - number is 25.
 * - The condition (number > 0) is true.
 * - "Positive" is printed.
 * ============================================================================
 */