/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 01-methods
 * File       : Exercise02.java
 * Package    : methods.arrays.methods
 * Description: Calculates the average of two scores using
 *              a method with parameters and a return value.
 * ============================================================
 */

package methodsandarrays.methods;

public class Exercise02
{
    static double calculateAverage(double score1, double score2)
    {
        return (score1 + score2) / 2;
    }

    public static void main(String[] args)
    {
        double average = calculateAverage(30.0, 20.0);

        System.out.println("Average = " + average);
    }
}

/*
 * ============================
 * Expected Output
 * ============================
 *
 * Average = 25.0
 *
 */