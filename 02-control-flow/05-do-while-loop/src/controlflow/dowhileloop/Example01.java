/*
 * ============================================================
 * Repository : java-roadmap
 * Topic      : 02-control-flow/05-do-while-loop
 * File       : Example01.java
 * Package    : controlflow.dowhileloop
 * Description: Demonstrates the basic execution flow of a
 *              do-while loop.
 * Author     : Mehdi
 * ============================================================
 */

package controlflow.dowhileloop;

public class Example01 {

    public static void main(String[] args) {

        int number = 1;

        do {
            System.out.println(number);
            number++;
        } while (number <= 5);

    }
}

/*
 * ============================================================
 * Expected Output
 * ------------------------------------------------------------
 * 1
 * 2
 * 3
 * 4
 * 5
 * ============================================================
 */