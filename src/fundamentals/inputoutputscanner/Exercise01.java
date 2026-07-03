/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 04 - Input / Output (Scanner)
 * File        : Exercise01.java
 * Topic       : Scanner Buffer Problem
 * Description : Read age and full name correctly.
 * Author      : Mehdi
 * ============================================================================
 */
package fundamentals.inputoutputscanner;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println();

        System.out.println("Age : " + age);
        System.out.println("Full Name : " + fullName);

        input.close();

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Enter your age: 25
 * Enter your full name: Mehdi Karimi
 *
 * Age : 25
 * Full Name : Mehdi Karimi
 * ============================================================================
 */