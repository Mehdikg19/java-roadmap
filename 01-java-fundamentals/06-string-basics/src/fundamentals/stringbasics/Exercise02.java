/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 06 - String Basics
 * File        : Exercise02.java
 * Topic       : Student Profile
 * Description : Calculate age and print a student profile.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.stringbasics;

public class Exercise02 {

    public static void main(String[] args) {

        String firstName = "Mehdi";
        String lastName = "Karimi";

        int birthYear = 1983;
        int currentYear = 2026;

        int age = currentYear - birthYear;

        System.out.println("===== Student Profile =====");
        System.out.println("Name : " + firstName + " " + lastName);
        System.out.println("Age  : " + age);
        System.out.println("===========================");

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * ===== Student Profile =====
 * Name : Mehdi Karimi
 * Age  : 43
 * ===========================
 * ============================================================================
 */