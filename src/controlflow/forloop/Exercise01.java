/*
 * Module: 02-control-flow
 * Topic: 03-for-loop
 * File: Exercise01.java
 * Purpose: Print numbers from 1 to 10 using a for loop
 */

package controlflow.forloop;

public class Exercise01
{

    public static void main(String[] args)
    {

        System.out.println("===== Count Up =====");

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

        System.out.println("Loop completed.");
    }
}

/*
Expected Output:

===== Count Up =====
1
2
3
4
5
6
7
8
9
10
Loop completed.
*/