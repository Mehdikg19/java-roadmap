/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : Multidimensional Arrays
 * Lesson     : Two-Dimensional Arrays
 * File       : Example02.java
 * Package    : methodsandarrays.multidimensionalarrays
 * Description: Demonstrates traversing a two-dimensional
 *              array using nested for loops.
 * ============================================================
 */

package methodsandarrays.multidimensionalarrays;

public class Example02 {

    public static void main(String[] args) {

        int[][] scores = {
                {80, 85, 90},
                {70, 75, 88},
                {95, 92, 89}
        };

        for (int row = 0; row < scores.length; row++) {

            for (int column = 0; column < scores[row].length; column++) {

                System.out.println(scores[row][column]);
            }
        }
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 80
 * 85
 * 90
 * 70
 * 75
 * 88
 * 95
 * 92
 * 89
 */