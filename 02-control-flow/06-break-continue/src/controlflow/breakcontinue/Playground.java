/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 02-Control Flow
 * Lesson     : 06-break-continue
 * File       : Playground.java
 * Package    : controlflow.breakcontinue
 * Description: Experiment with break and continue in loops.
 * ============================================================
 */

package controlflow.breakcontinue;

public class Playground
{
    public static void main(String[] args)
    {
        // ============================================================
        // Experiment 1: break in nested loops
        // ============================================================

        System.out.println("Experiment 1:");

        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                if (j == 2)
                {
                    break;
                }

                System.out.println(i + " " + j);
            }
        }


        // ============================================================
        // Experiment 2: continue in nested loops
        // ============================================================

        System.out.println("\nExperiment 2:");

        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                if (j == 2)
                {
                    continue;
                }

                System.out.println(i + " " + j);
            }
        }


        // ============================================================
        // Experiment 3: break and continue together
        // ============================================================

        System.out.println("\nExperiment 3:");

        for (int i = 1; i <= 10; i++)
        {
            if (i % 2 == 0)
            {
                continue;
            }

            if (i == 7)
            {
                break;
            }

            System.out.println(i);
        }
    }
}

/*
 * ============================
 * Expected Observations
 * ============================
 *
 * Experiment 1:
 * break stops only the nearest inner loop.
 * The outer loop continues with its next iteration.
 *
 * Experiment 2:
 * continue skips only the current iteration of the nearest
 * inner loop.
 * The outer loop continues normally.
 *
 * Experiment 3:
 * continue skips even numbers.
 * When i reaches 7, break stops the loop before 7 is printed.
 *
 */