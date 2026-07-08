/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 05 - Constants & final
 * File        : Exercise01.java
 * Topic       : Declaring Constants
 * Description : Create and print multiple constants.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.constantsfinal;

public class Exercise01 {

    public static void main(String[] args) {

        final double PI = 3.14159;
        final int DAYS_IN_WEEK = 7;
        final int HOURS_IN_DAY = 24;

        System.out.println("PI : " + PI);
        System.out.println("Days in Week : " + DAYS_IN_WEEK);
        System.out.println("Hours in Day : " + HOURS_IN_DAY);

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * PI : 3.14159
 * Days in Week : 7
 * Hours in Day : 24
 * ============================================================================
 */