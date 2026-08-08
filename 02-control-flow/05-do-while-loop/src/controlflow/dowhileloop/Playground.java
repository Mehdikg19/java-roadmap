/*
 * ============================================================
 * Repository : java-roadmap
 * Topic      : 02-control-flow/05-do-while-loop
 * File       : Playground.java
 * Package    : controlflow.dowhileloop
 * Description: Experiments with do-while execution order,
 *              conditions, boundaries, and termination.
 * Author     : Mehdi
 * ============================================================
 */

package controlflow.dowhileloop;

public class Playground {

    public static void main(String[] args) {

        // Experiment 1:
        // What happens when the initial condition is false?

        int number = 10;

        do {
            System.out.println("Experiment 1: " + number);
            number++;
        } while (number < 5);


        // Experiment 2:
        // Observe the effect of changing the control variable.

        int counter = 1;

        do {
            System.out.println("Experiment 2: " + counter);
            counter += 2;
        } while (counter <= 7);


        // Experiment 3:
        // Observe the behavior when the condition becomes false
        // after the first execution.

        int value = 5;

        do {
            System.out.println("Experiment 3: " + value);
            value++;
        } while (value < 5);

    }
}

/*
 * ============================================================
 * Expected Observations
 * ------------------------------------------------------------
 * Experiment 1:
 * The body executes once even though the condition is initially
 * false.
 *
 * Experiment 2:
 * The loop continues while the condition remains true.
 *
 * Experiment 3:
 * The body executes once because the condition is checked after
 * the first execution.
 *
 * Experiment with the initial values, operators, and increments
 * and record what changes.
 * ============================================================
 */