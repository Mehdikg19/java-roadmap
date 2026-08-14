/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 03-Arrays
 * File       : Exercise02.java
 * Package    : methodsandarrays.arrays
 * Description: Count positive numbers, negative numbers, and
 *              zeros in an integer array.
 * ============================================================
 */

package methodsandarrays.arrays;

public class Exercise02 {

    public static void main(String[] args) {

        int[] numbers = {12, -5, 8, -3, 0, 15, -10, 7};

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                countZero++;
            } else if (numbers[i] < 0) {
                countNegative++;
            } else {
                countPositive++;
            }
        }

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Positive numbers: 4
 * Negative numbers: 3
 * Zero numbers: 1
 */