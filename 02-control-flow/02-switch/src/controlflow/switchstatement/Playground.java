/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 02 - Control Flow
 * File        : Playground.java
 * Topic       : Exploring Switch Statement
 * Description : Experiments with the switch statement.
 * Author      : Mehdi
 * ============================================================================
 */

package controlflow.switchstatement;

public class Playground {

    public static void main(String[] args) {

        // =====================================================
        // Experiment 1 : Valid Integer Value
        // =====================================================

        int day = 5;

        switch (day) {

            case 1:

                System.out.println("Monday");
                break;

            case 5:

                System.out.println("Friday");
                break;

            default:

                System.out.println("Invalid Day");

        }

        System.out.println();

        // =====================================================
        // Experiment 2 : Invalid Integer Value
        // =====================================================

        day = 10;

        switch (day) {

            case 1:

                System.out.println("Monday");
                break;

            case 5:

                System.out.println("Friday");
                break;

            default:

                System.out.println("Invalid Day");

        }

        System.out.println();

        // =====================================================
        // Experiment 3 : String Value
        // =====================================================

        String language = "Python";

        switch (language) {

            case "Java":

                System.out.println("Backend Development");
                break;

            case "Python":

                System.out.println("AI and Data Science");
                break;

            default:

                System.out.println("Unknown Language");

        }

    }

}

/*
 * ============================================================================
 * Expected Observations
 * ============================================================================
 * Experiment 1
 * - day is 5.
 * - Case 5 matches.
 * - "Friday" is printed.
 *
 * Experiment 2
 * - day is 10.
 * - No case matches.
 * - The default block is executed.
 *
 * Experiment 3
 * - language is "Python".
 * - The matching String case is executed.
 * - "AI and Data Science" is printed.
 * ============================================================================
 */