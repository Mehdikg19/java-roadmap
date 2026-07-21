/*
 * Module: 02-control-flow
 * Topic: 03-for-loop
 * File: Example02.java
 * Purpose: Different ways to update the loop counter
 */

package controlflow.forloop;

public class Example02 {

    public static void main(String[] args) {

        System.out.println("=== Count Up ===");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("=== Count Down ===");

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("=== Even Numbers ===");

        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

/*
Expected Output:

=== Count Up ===
1
2
3
4
5

=== Count Down ===
5
4
3
2
1

=== Even Numbers ===
2
4
6
8
10
*/