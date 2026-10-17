// * ============================================================
// * Java Roadmap Project
// * Topic      : 04-OOP Basics
// * Lesson     : 05-Packages
// * File       : Example02.java
// * Package    : oopbasics.packages
// * Description: Demonstrate imports from the Java standard library.
// * ============================================================

package oopbasics.packages;

import java.util.ArrayList;
import java.util.List;

public class Example02
{
    public static void main(String[] args)
    {
        List<String> students = new ArrayList<>();

        students.add("Sara");
        students.add("Ali");
        students.add("Mina");

        System.out.println("Packages and Imports");
        System.out.println("Number of students: " + students.size());
        System.out.println("Students: " + students);
        System.out.println("Contains Ali: " + students.contains("Ali"));
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Packages and Imports
 * Number of students: 3
 * Students: [Sara, Ali, Mina]
 * Contains Ali: true
 */