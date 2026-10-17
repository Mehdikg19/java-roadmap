/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 04-OOP Basics
 * Lesson     : 05-Packages
 * File       : Exercise01.java
 * Package    : oopbasics.packages
 * Description: Practice using packages, imports, List, and ArrayList.
 * ============================================================
 */

package oopbasics.packages;

import java.util.ArrayList;
import java.util.List;

public class Exercise01
{
    public static void main(String[] args)
    {
        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("Pascal");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");

        System.out.println("Count languages is: " + programmingLanguages.size());
        System.out.println("Programming Languages List: " + programmingLanguages);
        System.out.println("Contains Java: " + programmingLanguages.contains("Java"));
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Count languages is: 3
 * Programming Languages List: [Pascal, Python, JavaScript]
 * Contains Java: false
 */