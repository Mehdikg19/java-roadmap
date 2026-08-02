/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 02-Control Flow
 * Lesson     : 04-While Loop
 * File       : Playground.java
 * Package    : controlflow.whileloop
 * Description: Experiment with different while loop scenarios.
 * ============================================================
 */

package controlflow.whileloop;

public class Playground {

    public static void main(String[] args) {

        // ============================================
        // Experiment 1: Condition is false from the start
        // Expected: No output
        // ============================================

        int a = 10;

        while (a < 5) {
            System.out.println(a);
        }

        // ============================================
        // Experiment 2: Count down from 3 to 1
        // Expected Output:
        // 3
        // 2
        // 1
        // ============================================

        int b = 3;

        while (b >= 1) {
            System.out.println(b);
            b--;
        }

        // ============================================
        // Experiment 3: Increase by 3
        // Expected Output:
        // 0
        // 3
        // 6
        // 9
        // 12
        // ============================================

        int c = 0;

        while (c <= 12) {
            System.out.println(c);
            c += 3;
        }
    }
}

/*
 * =====================
 * Expected Observations
 * =====================
 * Experiment 1:
 * - The while loop does not execute because the condition is false.
 *
 * Experiment 2:
 * - The numbers 3, 2, and 1 are printed in descending order.
 *
 * Experiment 3:
 * - The value increases by 3 each iteration until it reaches 12.
 */