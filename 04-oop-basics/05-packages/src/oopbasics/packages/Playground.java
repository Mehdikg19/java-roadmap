/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 04-OOP Basics
 * Lesson     : 05-Packages
 * File       : Playground.java
 * Package    : oopbasics.packages
 * Description: Experiment with imports and fully qualified names.
 * ============================================================
 */

package oopbasics.packages;

public class Playground
{
    public static void main(String[] args)
    {
        java.util.List<String> programmingLanguages =
                new java.util.ArrayList<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");

        System.out.println("Packages Playground");
        System.out.println("Programming Languages: " + programmingLanguages);
        System.out.println("Number of Languages: " + programmingLanguages.size());
        System.out.println("Contains Java: " + programmingLanguages.contains("Java"));
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Packages Playground
 * Programming Languages: [Java, Python, JavaScript]
 * Number of Languages: 3
 * Contains Java: true
 */