/*
 * Module: 02-control-flow
 * Topic: 03-for-loop
 * File: Playground.java
 * Purpose: Experiment with different for loop variations
 */

package controlflow.forloop;

public class Playground
{

    public static void main(String[] args)
    {

        System.out.println("===== Playground: Count Up =====");

        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("===== Playground: Count Down =====");

        for (int i = 5; i >= 1; i--)
        {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("===== Playground: Even Numbers =====");

        for (int i = 2; i <= 10; i += 2)
        {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("===== Playground: Odd Numbers =====");

        for (int i = 1; i <= 9; i += 2)
        {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("===== Playground: Multiples of 3 =====");

        for (int i = 3; i <= 30; i += 3)
        {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("===== Playground Finished =====");
    }
}

/*
Expected Observations

1. A for loop can count upward using i++.
2. A for loop can count downward using i--.
3. The update expression can increase by more than one (i += 2).
4. The starting value determines which numbers are printed.
5. The loop stops immediately when the condition becomes false.

*/