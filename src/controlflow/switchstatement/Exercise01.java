/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 02 - Control Flow
 * File        : Exercise01.java
 * Topic       : Switch Statement
 * Description : Display the month name using the switch statement.
 * Author      : Mehdi
 * ============================================================================
 */

package controlflow.switchstatement;

public class Exercise01 {

    public static void main(String[] args) {

        int month = 8;

        switch (month) {

            case 1:

                System.out.println("January");
                break;

            case 2:

                System.out.println("February");
                break;

            case 3:

                System.out.println("March");
                break;

            case 4:

                System.out.println("April");
                break;

            case 5:

                System.out.println("May");
                break;

            case 6:

                System.out.println("June");
                break;

            case 7:

                System.out.println("July");
                break;

            case 8:

                System.out.println("August");
                break;

            default:

                System.out.println("Invalid Month");

        }

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * August
 * ============================================================================
 */