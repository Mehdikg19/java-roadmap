/*
 * ============================================================
 * Java Roadmap
 * Topic: Operators
 * File: Example02.java
 * Description: Demonstrates comparison and logical operators.
 * Author: Mehdi
 * ============================================================
 */

package fundamentals.operators;

public class Example02 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));

    }
}

/*
Expected Output:

x == y : false
x != y : true
x > y  : false
x < y  : true
x >= y : false
x <= y : true
*/