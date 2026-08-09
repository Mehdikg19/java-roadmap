/*
 * ============================================================
 * Java Roadmap
 * Topic: Operators
 * File: Exercise01.java
 * Description: Playground using arithmetic operators.
 * Author: Mehdi
 * ============================================================
 */

package fundamentals.operators;

public class Exercise01 {
    public static void main(String[] args) {

        int a = 15;
        int b = 4;

        System.out.println("Addition " + (a + b));
        System.out.println("Substraction " + (a - b));
        System.out.println("Multiplication " + (a * b));
        System.out.println("Division " + (a / b));
        System.out.println("Remainder " + (a % b));
        System.out.println();
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

    }
}

/*
Expected Output:

Addition       : 19
Subtraction    : 11
Multiplication : 60
Division       : 3
Remainder      : 3

a == b : false
a != b : true
a > b  : true
a < b  : false
a >= b : true
a <= b : false
*/