/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : Multidimensional Arrays
 * Lesson     : Two-Dimensional Arrays
 * File       : Exercise02.java
 * Package    : methodsandarrays.multidimensionalarrays
 * Description: Calculates the total, count, and average of
 *              elements in a two-dimensional integer array.
 * ============================================================
 */

package methodsandarrays.multidimensionalarrays;

public class Exercise02 {

    public static void main(String[] args) {

        int[][] scores = {
                {85, 90, 78},
                {92, 88, 95},
                {70, 80, 75}
        };

        int total = 0;
        int count = 0;

        for (int row = 0; row < scores.length; row++) {

            for (int column = 0; column < scores[row].length; column++) {
                total += scores[row][column];
                count++;
            }
        }

        double average = (double) total / count;

        System.out.println("Total: " + total);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Total: 753
 * Count: 9
 * Average: 83.66666666666667
 */