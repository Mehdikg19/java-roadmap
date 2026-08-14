/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 03-Arrays
 * File       : Example02.java
 * Package    : methodsandarrays.arrays
 * Description: Traverse an array with a for loop and process
 *              elements using a conditional statement.
 * ============================================================
 */

package methodsandarrays.arrays;

public class Example02 {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 5) {
                System.out.println(numbers[i]);
            }
        }
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 6
 * 8
 * 10
 */