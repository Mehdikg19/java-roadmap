/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 03-Arrays
 * File       : Exercise01.java
 * Package    : methodsandarrays.arrays
 * Description: Count the number of even elements in an array.
 * ============================================================
 */

package methodsandarrays.arrays;

public class Exercise01 {

    public static void main(String[] args) {

        int[] numbers = {12, 7, 4, 9, 16, 3, 20};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Count of even numbers: " + count);
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Count of even numbers: 4
 */