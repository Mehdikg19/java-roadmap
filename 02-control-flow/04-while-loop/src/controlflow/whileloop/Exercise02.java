/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 02-Control Flow
 * Lesson     : 04-While Loop
 * File       : Exercise02.java
 * Package    : controlflow.whileloop
 * Description: Print numbers from 10 to 1 using a while loop.
 * ============================================================
 */

package controlflow.whileloop;

public class Exercise02 {

    public static void main(String[] args) {

        int i = 10;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 10
 * 9
 * 8
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 */