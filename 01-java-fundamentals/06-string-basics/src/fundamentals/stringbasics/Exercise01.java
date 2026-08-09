/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 06 - String Basics
 * File        : Exercise01.java
 * Topic       : Printing Student Information
 * Description : Print student information using String concatenation.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.stringbasics;

public class Exercise01 {

    public static void main(String[] args) {

        String firstName = "Mehdi";
        String lastName = "Karimi";
        int age = 25;

        System.out.println("Student Information");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Student Information
 * Name: Mehdi Karimi
 * Age: 25
 * ============================================================================
 */