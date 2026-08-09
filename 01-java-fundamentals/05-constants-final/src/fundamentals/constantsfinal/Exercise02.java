/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 05 - Constants & final
 * File        : Exercise02.java
 * Topic       : Constants in Calculations
 * Description : Calculate total seconds using constants.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.constantsfinal;

public class Exercise02 {

    public static void main(String[] args) {

        final int MINUTES_IN_HOUR = 60;
        final int SECONDS_IN_MINUTE = 60;

        int hours = 3;
        int totalSeconds;

        totalSeconds = hours * (MINUTES_IN_HOUR * SECONDS_IN_MINUTE);

        System.out.println("Hours : " + hours);
        System.out.println("Total Seconds : " + totalSeconds);

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Hours : 3
 * Total Seconds : 10800
 * ============================================================================
 */