/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 02-Control Flow
 * Lesson     : 04-While Loop
 * File       : Exercise01.java
 * Package    : controlflow.whileloop
 * Description: Print even numbers from 2 to 10 using a while loop.
 * ============================================================
 */

package controlflow.whileloop;

public class Exercise01 {

    public static void main(String[] args) {

        int i = 2;

        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 2
 * 4
 * 6
 * 8
 * 10
 */