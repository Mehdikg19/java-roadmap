/*
 * ============================================================
 * Repository : java-roadmap
 * Topic      : 02-control-flow/05-do-while-loop
 * File       : Example02.java
 * Package    : controlflow.dowhileloop
 * Description: Demonstrates that a do-while loop executes at
 *              least once even when its condition is false.
 * Author     : Mehdi
 * ============================================================
 */

package controlflow.dowhileloop;

public class Example02 {

    public static void main(String[] args) {

        int number = 10;

        do {
            System.out.println("Number: " + number);
            number++;
        } while (number < 5);

    }
}

/*
 * ============================================================
 * Expected Output
 * ------------------------------------------------------------
 * Number: 10
 * ============================================================
 */