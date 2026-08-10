/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 02-Control Flow
 * Lesson     : 06-break-continue
 * File       : Example01.java
 * Package    : controlflow.breakcontinue
 * Description: Demonstrates how break stops the current loop.
 * ============================================================
 */

package controlflow.breakcontinue;

public class Example01
{
    public static void main(String[] args)
    {
        for (int number = 1; number <= 10; number++)
        {
            if (number == 6)
            {
                break;
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
 * 2
 * 3
 * 4
 * 5
 *
 */