/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 02 - Control Flow
 * File        : Exercise02.java
 * Topic       : Switch Statement
 * Description : Display the user access level using the switch statement.
 * Author      : Mehdi
 * ============================================================================
 */

package controlflow.switchstatement;

public class Exercise02 {

    public static void main(String[] args) {

        String role = "Admin";

        switch (role) {

            case "Admin":

                System.out.println("Full Access");
                break;

            case "Editor":

                System.out.println("Edit Access");
                break;

            case "Viewer":

                System.out.println("Read Only");
                break;

            default:

                System.out.println("Unknown Role");

        }

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Full Access
 * ============================================================================
 */