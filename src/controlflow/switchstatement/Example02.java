/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 02 - Control Flow
 * File        : Example02.java
 * Topic       : Switch Statement
 * Description : Demonstrates the use of the switch statement with String values.
 * Author      : Mehdi
 * ============================================================================
 */

package controlflow.switchstatement;

public class Example02 {

    public static void main(String[] args) {

        String language = "Java";

        switch (language) {

            case "Java":

                System.out.println("Backend Development");
                break;

            case "Python":

                System.out.println("AI and Data Science");
                break;

            case "JavaScript":

                System.out.println("Web Development");
                break;

            default:

                System.out.println("Unknown Language");

        }

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Backend Development
 * ============================================================================
 */