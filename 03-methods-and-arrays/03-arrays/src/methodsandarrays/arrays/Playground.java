/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 03-Arrays
 * File       : Playground.java
 * Package    : methodsandarrays.arrays
 * Description: Experiment with array indexes, default values,
 *              array boundaries, and element updates.
 * ============================================================
 */

package methodsandarrays.arrays;

public class Playground {

    public static void main(String[] args) {

        // Experiment 1: Array elements have default values.
        int[] numbers = new int[5];

        System.out.println(numbers[0]);
        System.out.println(numbers[4]);

        // Experiment 2: Only assigned elements change.
        numbers[0] = 10;
        numbers[1] = 20;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // Experiment 3: Array length and last valid index.
        System.out.println(numbers.length);
        System.out.println(numbers[numbers.length - 1]);

        /*
         * Experiment 4: Uncomment the following line to observe
         * ArrayIndexOutOfBoundsException.
         *
         * numbers[numbers.length]
         */
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 0
 * 0
 * 10
 * 20
 * 0
 * 5
 * 0
 *
 * Experiment 4:
 * ArrayIndexOutOfBoundsException
 * when numbers[numbers.length] is executed.
 */