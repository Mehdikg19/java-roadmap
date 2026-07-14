/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 02 - Control Flow
 * File        : Exercise01.java
 * Topic       : Basic if-else Statement
 * Description : Check whether a person is eligible to vote.
 * Author      : Mehdi
 * ============================================================================
 */

package controlflow.ifelse;

public class Exercise01 {

    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {

            System.out.println("Eligible to Vote");

        } else {

            System.out.println("Not Eligible to Vote");

        }

        System.out.println("Program Finished");

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Eligible to Vote
 * Program Finished
 * ============================================================================
 */