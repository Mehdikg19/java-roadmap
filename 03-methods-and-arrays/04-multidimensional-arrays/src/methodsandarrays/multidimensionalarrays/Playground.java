/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : Multidimensional Arrays
 * Lesson     : Two-Dimensional Arrays
 * File       : Playground.java
 * Package    : methodsandarrays.multidimensionalarrays
 * Description: Experiments with two-dimensional arrays,
 *              row lengths, invalid indexes, jagged arrays,
 *              and total element counting.
 * ============================================================
 */

package methodsandarrays.multidimensionalarrays;

public class Playground {

    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30},
                {40, 50},
                {60, 70, 80, 90}
        };

        /*
         * ====================================================
         * Experiment 1
         * Purpose: Compare the number of rows with the length
         *          of each individual row.
         * ====================================================
         */

        System.out.println("Experiment 1");

        System.out.println("Rows: " + numbers.length);

        for (int row = 0; row < numbers.length; row++) {
            System.out.println(
                    "Row " + row + " length: " + numbers[row].length
            );
        }

        /*
         * Expected Observation:
         * Rows: 3
         * Row 0 length: 3
         * Row 1 length: 2
         * Row 2 length: 4
         */


        /*
         * ====================================================
         * Experiment 2
         * Purpose: Observe the runtime behavior of accessing
         *          an invalid index.
         *
         * Note:
         * This experiment is intentionally commented out
         * because it causes a runtime exception and would
         * prevent the remaining experiments from executing.
         * ====================================================
         */

        System.out.println("\nExperiment 2");

        // System.out.println(numbers[1][2]);

        /*
         * Expected Observation:
         * ArrayIndexOutOfBoundsException
         *
         * Reason:
         * Row 1 contains only two elements:
         *
         * {40, 50}
         *
         * Valid indexes:
         * 0, 1
         *
         * Index 2 is invalid.
         */


        /*
         * ====================================================
         * Experiment 3
         * Purpose: Traverse rows with different lengths using
         *          nested for loops.
         * ====================================================
         */

        System.out.println("\nExperiment 3");

        for (int row = 0; row < numbers.length; row++) {

            for (int column = 0; column < numbers[row].length; column++) {

                System.out.println(numbers[row][column]);
            }
        }

        /*
         * Expected Observation:
         * 10
         * 20
         * 30
         * 40
         * 50
         * 60
         * 70
         * 80
         * 90
         *
         * No runtime exception occurs because the inner loop
         * uses numbers[row].length.
         */


        /*
         * ====================================================
         * Experiment 4
         * Purpose: Calculate the total number of elements in
         *          a jagged two-dimensional array.
         * ====================================================
         */

        System.out.println("\nExperiment 4");

        int totalElements = 0;

        for (int row = 0; row < numbers.length; row++) {

            totalElements += numbers[row].length;
        }

        System.out.println("Rows: " + numbers.length);
        System.out.println("Total elements: " + totalElements);

        /*
         * Expected Observation:
         * Rows: 3
         * Total elements: 9
         *
         * Calculation:
         * Row 0 → 3 elements
         * Row 1 → 2 elements
         * Row 2 → 4 elements
         *
         * Total → 3 + 2 + 4 = 9
         */
    }
}