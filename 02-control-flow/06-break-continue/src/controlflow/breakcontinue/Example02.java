/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 02-Control Flow
 * Lesson     : 06-break-continue
 * File       : Example02.java
 * Package    : controlflow.breakcontinue
 * Description: Demonstrates how continue skips the current
 *              iteration and continues the loop.
 * ============================================================
 */

package controlflow.breakcontinue;

public class Example02
{
    public static void main(String[] args)
    {
        for (int number = 1; number <= 10; number++)
        {
            if (number % 2 == 0)
            {
                continue;
            }

            System.out.println(number);
        }
    }
}

/*
 * ============================
 * Expected Output
 * ============================
 *
 * 1
 * 3
 * 5
 * 7
 * 9
 *
 */