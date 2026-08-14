/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : Multidimensional Arrays
 * Lesson     : Two-Dimensional Arrays
 * File       : Example01.java
 * Package    : methodsandarrays.multidimensionalarrays
 * Description: Demonstrates basic two-dimensional array
 *              creation, element access, and length.
 * ============================================================
 */

package methodsandarrays.multidimensionalarrays;

public class Example01 {

    public static void main(String[] args) {

        int[][] scores = {
                {80, 85, 90},
                {70, 75, 88},
                {95, 92, 89}
        };

        System.out.println(scores[0][1]);
        System.out.println(scores[2][0]);

        System.out.println(scores.length);
        System.out.println(scores[1].length);
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 85
 * 95
 * 3
 * 3
 */