/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 04 - Input / Output (Scanner)
 * File        : Playground.java
 * Topic       : Scanner Experiments
 * Description : Personal experiments with Scanner methods.
 * Author      : Mehdi
 * ============================================================================
 */
package fundamentals.inputoutputscanner;

import java.util.Scanner;

public class Playground {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =====================================================
        // Experiment 1 : next()
        // =====================================================

        System.out.println("========== Experiment 1 ==========");

        System.out.print("Enter first name: ");
        String firstName = input.next();

        System.out.println("First Name = " + firstName);

        input.nextLine();

        System.out.println();

        // =====================================================
        // Experiment 2 : nextLine()
        // =====================================================

        System.out.println("========== Experiment 2 ==========");

        System.out.print("Enter full name: ");
        String fullName = input.nextLine();

        System.out.println("Full Name = " + fullName);

        System.out.println();

        // =====================================================
        // Experiment 3 : nextInt() + Buffer
        // =====================================================

        System.out.println("========== Experiment 3 ==========");

        System.out.print("Enter age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Enter city: ");
        String city = input.nextLine();

        System.out.println();

        System.out.println("Age  = " + age);
        System.out.println("City = " + city);

        System.out.println();

        // =====================================================
        // Experiment 4 : nextDouble()
        // =====================================================

        System.out.println("========== Experiment 4 ==========");

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        input.nextLine();

        System.out.print("Enter country: ");
        String country = input.nextLine();

        System.out.println();

        System.out.println("Height  = " + height);
        System.out.println("Country = " + country);

        input.close();

    }

}
/*
 * ============================================================================
 * Notes
 * ============================================================================
 * Experiment 1
 * ------------
 * next()
 * - Reads only one word.
 * - Stops reading when it reaches a space.
 *
 * Experiment 2
 * ------------
 * nextLine()
 * - Reads the entire line.
 * - Spaces are included in the result.
 *
 * Experiment 3
 * ------------
 * nextInt() leaves the Enter key inside the Scanner buffer.
 * Therefore:
 *
 * nextInt();
 * nextLine();
 *
 * The first nextLine() clears the buffer.
 * The second nextLine() reads the real text.
 *
 * Experiment 4
 * ------------
 * nextDouble() behaves exactly like nextInt().
 * If nextLine() comes after it, the remaining Enter
 * must be removed first.
 *
 * ============================================================================
 * Summary
 * ============================================================================
 *
 * next()        → Reads one word.
 *
 * nextLine()    → Reads an entire line.
 *
 * nextInt()     → Reads integer only.
 *
 * nextDouble()  → Reads decimal number only.
 *
 * Whenever nextInt(), nextDouble(), nextFloat(),
 * nextLong(), nextShort(), nextByte(),
 * nextBoolean() or next()
 * are followed by nextLine(),
 * always clear the buffer first:
 *
 * input.nextLine();
 *
 * ============================================================================
 */