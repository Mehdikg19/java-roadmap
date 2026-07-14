/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 02 - Control Flow
 * File        : Example01.java
 * Topic       : Switch Statement
 * Description : Demonstrates the use of the switch statement with integer values.
 * Author      : Mehdi
 * ============================================================================
 */

package controlflow.switchstatement;

public class Example01 {

    public static void main(String[] args) {

        int day = 3;

        switch (day) {

            case 1:

                System.out.println("Monday");
                break;

            case 2:

                System.out.println("Tuesday");
                break;

            case 3:

                System.out.println("Wednesday");
                break;

            default:

                System.out.println("Invalid Day");

        }

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Wednesday
 * ============================================================================
 */