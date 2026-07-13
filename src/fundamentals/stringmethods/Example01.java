/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 01 - Java Fundamentals
 * File        : Example01.java
 * Topic       : String Methods
 * Description : Basic String methods:
 *               - length()
 *               - toUpperCase()
 *               - toLowerCase()
 *               - trim()
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.stringmethods;

public class Example01 {

    public static void main(String[] args) {

        // ==========================================================
        // Example 1 : length()
        // ==========================================================

        String word = "Programming";

        System.out.println(word.length());

        System.out.println();


        // ==========================================================
        // Example 2 : toUpperCase()
        // ==========================================================

        String city = "tabriz";

        city = city.toUpperCase();

        System.out.println(city);

        System.out.println();


        // ==========================================================
        // Example 3 : toLowerCase()
        // ==========================================================

        String country = "IRAN";

        country = country.toLowerCase();

        System.out.println(country);

        System.out.println();


        // ==========================================================
        // Example 4 : trim()
        // ==========================================================

        String name = "   Mehdi   ";

        System.out.println(name.trim());

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 *
 * 11
 *
 * TABRIZ
 *
 * iran
 *
 * Mehdi
 *
 * ============================================================================
 */