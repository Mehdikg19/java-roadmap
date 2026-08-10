/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 02-Control Flow
 * Lesson     : 06-break-continue
 * File       : Exercise02.java
 * Package    : controlflow.breakcontinue
 * Description: Prints all odd numbers between 1 and 20 by
 *              using continue to skip even numbers.
 * ============================================================
 */

package controlflow.breakcontinue;

public class Exercise02
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 20; i++)
        {
            if (i % 2 == 0)
            {
                continue;
            }

            System.out.println(i);
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
 * 11
 * 13
 * 15
 * 17
 * 19
 *
 */