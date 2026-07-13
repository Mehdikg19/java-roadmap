/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 01 - Java Fundamentals
 * File        : Playground.java
 * Topic       : String Methods
 * Description : Playground for experimenting with String methods.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.stringmethods;

public class Playground {

    public static void main(String[] args) {

        String text = "   Java Programming   ";

        System.out.println("Original: [" + text + "]");
        System.out.println();

        // length()
        System.out.println("Length: " + text.length());

        // trim()
        String trimmed = text.trim();
        System.out.println("Trim: [" + trimmed + "]");

        // toUpperCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // contains()
        System.out.println("Contains \"Java\": " + trimmed.contains("Java"));

        // startsWith()
        System.out.println("Starts With \"Java\": " + trimmed.startsWith("Java"));

        // endsWith()
        System.out.println("Ends With \"Programming\": "
                + trimmed.endsWith("Programming"));

        // replace()
        System.out.println("Replace: "
                + trimmed.replace("Java", "Python"));

        // substring()
        System.out.println("Substring (5): "
                + trimmed.substring(5));

        System.out.println("Substring (5,16): "
                + trimmed.substring(5, 16));

        // equals()
        System.out.println("Equals \"Java Programming\": "
                + trimmed.equals("Java Programming"));

        // equalsIgnoreCase()
        System.out.println("Equals Ignore Case: "
                + trimmed.equalsIgnoreCase("java programming"));

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 *
 * Original: [   Java Programming   ]
 *
 * Length: 22
 * Trim: [Java Programming]
 * Uppercase: JAVA PROGRAMMING
 * Lowercase: java programming
 * Contains "Java": true
 * Starts With "Java": true
 * Ends With "Programming": true
 * Replace: Python Programming
 * Substring (5): Programming
 * Substring (5,16): Programmin
 * Equals "Java Programming": true
 * Equals Ignore Case: true
 *
 * ============================================================================
 */