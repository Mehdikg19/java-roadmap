/*
 * Module: 02-control-flow
 * Topic: 03-for-loop
 * File: Exercise02.java
 * Purpose: Print even numbers from 2 to 20 using a for loop
 */

package controlflow.forloop;

public class Exercise02
{

    public static void main(String[] args)
    {

        System.out.println("===== Even Numbers =====");

        for (int i = 2; i <= 20; i += 2)
        {
            System.out.println(i);
        }

        System.out.println("Loop completed.");
    }
}

/*
Expected Output:

===== Even Numbers =====
2
4
6
8
10
12
14
16
18
20
Loop completed.
*/