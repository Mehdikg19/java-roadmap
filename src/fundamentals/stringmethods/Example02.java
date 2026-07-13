/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 01 - Java Fundamentals
 * File        : Example02.java
 * Topic       : String Methods
 * Description : Advanced String methods:
 *               - contains()
 *               - startsWith()
 *               - endsWith()
 *               - replace()
 *               - substring()
 *               - equals()
 *               - equalsIgnoreCase()
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.stringmethods;

public class Example02 {

    public static void main(String[] args) {

        // ==========================================================
        // Example 1 : contains()
        // ==========================================================

        String text = "Java Programming";

        System.out.println(text.contains("Java"));
        System.out.println(text.contains("Python"));

        System.out.println();


        // ==========================================================
        // Example 2 : startsWith()
        // ==========================================================

        System.out.println(text.startsWith("Java"));
        System.out.println(text.startsWith("Programming"));

        System.out.println();


        // ==========================================================
        // Example 3 : endsWith()
        // ==========================================================

        System.out.println(text.endsWith("Programming"));
        System.out.println(text.endsWith("Java"));

        System.out.println();


        // ==========================================================
        // Example 4 : replace()
        // ==========================================================

        String sentence = "I like Java";

        System.out.println(sentence.replace("Java", "Python"));

        System.out.println();


        // ==========================================================
        // Example 5 : substring()
        // ==========================================================

        String language = "Programming";

        System.out.println(language.substring(3));
        System.out.println(language.substring(3, 8));

        System.out.println();


        // ==========================================================
        // Example 6 : equals()
        // ==========================================================

        String first = "Java";
        String second = "Java";

        System.out.println(first.equals(second));

        System.out.println();


        // ==========================================================
        // Example 7 : equalsIgnoreCase()
        // ==========================================================

        String a = "Java";
        String b = "JAVA";

        System.out.println(a.equalsIgnoreCase(b));

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 *
 * true
 * false
 *
 * true
 * false
 *
 * true
 * false
 *
 * I like Python
 *
 * gramming
 * gramm
 *
 * true
 *
 * true
 *
 * ============================================================================
 */