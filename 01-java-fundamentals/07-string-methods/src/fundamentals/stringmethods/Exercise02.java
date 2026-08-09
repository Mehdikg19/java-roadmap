/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 01 - Java Fundamentals
 * File        : Exercise02.java
 * Topic       : String Methods
 * Description : Search for a word inside a sentence.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.stringmethods;

public class Exercise02 {

    public static void main(String[] args) {

        String sentence = "Java Programming";

        System.out.println(sentence.contains("Java"));

        System.out.println(sentence.startsWith("Java"));

        System.out.println(sentence.endsWith("Programming"));

    }

}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * true
 * true
 * true
 * ============================================================================
 */