/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 02 - Control Flow
 * File        : Exercise02.java
 * Topic       : Check Login Permission
 * Description : Check whether a user is allowed to access the system.
 * Author      : Mehdi
 * ============================================================================
 */

package controlflow.ifelse;

public class Exercise02 {

    public static void main(String[] args) {

        boolean isLoggedIn = true;

        if (isLoggedIn) {

            System.out.println("Access Granted");

        } else {

            System.out.println("Access Denied");

        }

        System.out.println("Program Finished");

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Access Granted
 * Program Finished
 * ============================================================================
 */