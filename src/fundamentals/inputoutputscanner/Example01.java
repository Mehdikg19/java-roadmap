/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 04 - Input / Output (Scanner)
 * File        : Example01.java
 * Topic       : Scanner - Reading Full Name
 * Description : Read a complete line using nextLine().
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.inputoutputscanner;

import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");

        String fullName = input.nextLine();

        System.out.println("Welcome " + fullName);

        input.close();

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * Enter your full name: Mehdi Karimi
 * Welcome Mehdi Karimi
 * ============================================================================
 */