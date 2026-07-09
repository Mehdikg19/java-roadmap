/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 06 - String Basics
 * File        : Playground.java
 * Topic       : String Experiments
 * Description : Personal experiments with String behavior.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.stringbasics;

public class Playground {

    public static void main(String[] args) {

        // =====================================================
        // Experiment 1 : Concatenation
        // =====================================================

        System.out.println("========== Experiment 1 ==========");

        String firstName = "Mehdi";
        String lastName = "Karimi";

        System.out.println(firstName + " " + lastName);

        System.out.println();

        // =====================================================
        // Experiment 2 : Operator Precedence
        // =====================================================

        System.out.println("========== Experiment 2 ==========");

        System.out.println(10 + 20 + " Java");
        System.out.println("Java " + 10 + 20);
        System.out.println("Result = " + (10 + 20));

        System.out.println();

        // =====================================================
        // Experiment 3 : Reference
        // =====================================================

        System.out.println("========== Experiment 3 ==========");

        String language = "Java";

        System.out.println(language);

        language = "Python";

        System.out.println(language);

        System.out.println();

        // =====================================================
        // Experiment 4 : Immutable String
        // =====================================================

        System.out.println("========== Experiment 4 ==========");

        String text = "Java";

        System.out.println(text + " Programming");
        System.out.println(text);

        System.out.println();

        // =====================================================
        // Experiment 5 : concat()
        // =====================================================

        System.out.println("========== Experiment 5 ==========");

        String word = "Java";

        word = word.concat(" Programming");

        System.out.println(word);

    }

}

/*
 * ============================================================================
 * Notes
 * ============================================================================
 *
 * Experiment 1
 * ------------
 * Demonstrates String concatenation using the '+' operator.
 *
 * Experiment 2
 * ------------
 * Shows how operator precedence changes after a String appears.
 *
 * Experiment 3
 * ------------
 * Reassigning a String variable changes its reference, not the original String.
 *
 * Experiment 4
 * ------------
 * String objects are immutable.
 * Concatenation creates a new String without modifying the original.
 *
 * Experiment 5
 * ------------
 * concat() also returns a new String.
 * Store the returned value if you want to keep the change.
 *
 * ============================================================================
 * Summary
 * ============================================================================
 *
 * - String is a Class.
 * - String objects are immutable.
 * - '+' concatenates Strings.
 * - concat() returns a new String.
 * - Variables store references to String objects.
 * - Reassigning a variable changes the reference, not the original object.
 *
 * ============================================================================
 */