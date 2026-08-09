/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 02 - Control Flow
 * File        : Example02.java
 * Topic       : if-else Statement
 * Description : Demonstrates the use of the if-else statement.
 * Author      : Mehdi
 * ============================================================================
 */

package controlflow.ifelse;

public class Example02 {

    public static void main(String[] args) {

        int age = 16;

        if (age >= 18) {

            System.out.println("Adult");

        } else {

            System.out.println("Minor");

        }

        System.out.println("Program Finished");

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Minor
 * Program Finished
 * ============================================================================
 */