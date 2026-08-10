/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 02-Control Flow
 * Lesson     : 06-break-continue
 * File       : Exercise01.java
 * Package    : controlflow.breakcontinue
 * Description: Finds the first number between 1 and 20 that
 *              is divisible by both 3 and 5, then stops the
 *              loop using break.
 * ============================================================
 */

package controlflow.breakcontinue;

public class Exercise01
{
    public static void main(String[] args)
    {
        int number = 0;

        for (int i = 1; i <= 20; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                number = i;
                break;
            }
        }

        System.out.println(number);
    }
}

/*
 * ============================
 * Expected Output
 * ============================
 *
 * 15
 *
 */