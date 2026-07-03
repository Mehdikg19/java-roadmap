/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 04 - Input / Output (Scanner)
 * File        : Example02.java
 * Topic       : Scanner - Reading Multiple Data Types
 * Description : Read String, int and double values using Scanner.
 * Author      : Mehdi
 * ============================================================================
 */
package fundamentals.inputoutputscanner;

import java.util.Scanner;

public class Example02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your height: ");
        double height = input.nextDouble();

        System.out.println();

        System.out.println("===== User Information =====");
        System.out.println("Full Name : " + fullName);
        System.out.println("Age       : " + age);
        System.out.println("Height    : " + height);

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
 *
 * ===== User Information =====
 * Full Name : Mehdi Karimi
 * Age       : 25
 * Height    : 178.5
 * ============================================================================
 */