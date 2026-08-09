/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 02-Control Flow
 * Lesson     : 04-While Loop
 * File       : Example02.java
 * Package    : controlflow.whileloop
 * Description: Count down from 5 to 1 using a while loop.
 * ============================================================
 */

package controlflow.whileloop;

public class Example02 {

    public static void main(String[] args) {

        int number = 5;

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 5
 * 4
 * 3
 * 2
 * 1
 */