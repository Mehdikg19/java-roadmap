/*
 * Module: 02-control-flow
 * Topic: 03-for-loop
 * File: Example01.java
 * Purpose: Introduction to the for loop
 */

package controlflow.forloop;

public class Example01 {

    public static void main(String[] args) {

        System.out.println("=== Example 1: Basic for Loop ===");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        System.out.println("Loop finished.");
    }
}

/*
Expected Output:

=== Example 1: Basic for Loop ===
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Iteration: 5
Loop finished.
*/
