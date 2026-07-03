/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 04 - Input / Output (Scanner)
 * File        : Exercise02.java
 * Topic       : Scanner Practice
 * Description : Read multiple values and print a user profile.
 * Author      : Mehdi
 * ============================================================================
 */
package fundamentals.inputoutputscanner;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your height: ");
        double height = input.nextDouble();

        input.nextLine();

        System.out.print("Enter your city: ");
        String city = input.nextLine();

        System.out.println();

        System.out.println("===== User Profile =====");
        System.out.println("Full Name : " + fullName);
        System.out.println("Age       : " + age);
        System.out.println("Height    : " + height);
        System.out.println("City      : " + city);

        input.close();

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Enter your full name: Mehdi Karimi
 * Enter your age: 25
 * Enter your height: 178.5
 * Enter your city: Tehran
 *
 * ===== User Profile =====
 * Full Name : Mehdi Karimi
 * Age       : 25
 * Height    : 178.5
 * City      : Tehran
 * ============================================================================
 */