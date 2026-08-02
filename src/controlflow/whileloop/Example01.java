/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 02-Control Flow
 * Lesson     : 04-While Loop
 * File       : Example01.java
 * Package    : controlflow.whileloop
 * Description: Print numbers from 1 to 5 using a while loop.
 * ============================================================
 */

package controlflow.whileloop;

public class Example01 {

    public static void main(String[] args) {

        int number = 1;

        while (number <= 5) {
            System.out.println(number);
            number++;
        }
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * 1
 * 2
 * 3
 * 4
 * 5
 */