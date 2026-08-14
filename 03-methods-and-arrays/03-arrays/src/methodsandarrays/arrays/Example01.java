/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 03-Arrays
 * File       : Example01.java
 * Package    : methodsandarrays.arrays
 * Description: Demonstrate array creation, indexing, updating
 *              elements, and the length property.
 * ============================================================
 */

package methodsandarrays.arrays;

public class Example01 {

    public static void main(String[] args) {

        int[] scores = {18, 15, 20, 17, 16};

        System.out.println(scores[0]);
        System.out.println(scores[2]);

        scores[1] = 19;

        System.out.println(scores[1]);
        System.out.println(scores.length);
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 18
 * 20
 * 19
 * 5
 */