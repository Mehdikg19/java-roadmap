/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : Multidimensional Arrays
 * Lesson     : Two-Dimensional Arrays
 * File       : Exercise01.java
 * Package    : methodsandarrays.multidimensionalarrays
 * Description: Calculates the sum of all elements in a
 *              two-dimensional integer array.
 * ============================================================
 */

package methodsandarrays.multidimensionalarrays;

public class Exercise01 {

    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int sum = 0;

        for (int row = 0; row < numbers.length; row++) {

            for (int column = 0; column < numbers[row].length; column++) {
                sum += numbers[row][column];
            }
        }

        System.out.println(sum);
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 450
 */