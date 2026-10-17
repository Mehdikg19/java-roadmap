// * ============================================================
// * Java Roadmap Project
// * Topic      : 04-OOP Basics
// * Lesson     : 05-Packages
// * File       : Exercise02.java
// * Package    : oopbasics.packages
// * Description: Practice using List, ArrayList, and duplicate elements.
// * ============================================================

package oopbasics.packages;

import java.util.ArrayList;
import java.util.List;

public class Exercise02
{
    public static void main(String[] args)
    {
        List<String> students = new ArrayList<>();

        students.add("Mehdi");
        students.add("Reza");
        students.add("Ali");
        students.add("Sara");

        System.out.println("Size of List: " + students.size());
        System.out.println("List of Students: " + students);
        System.out.println("Contains Sara: " + students.contains("Sara"));

        System.out.println("==============================");

        students.add("Ali");

        System.out.println("Ali was added again.");
        System.out.println("Size of List: " + students.size());
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Size of List: 4
 * List of Students: [Mehdi, Reza, Ali, Sara]
 * Contains Sara: true
 * ==============================
 * Ali was added again.
 * Size of List: 5
 */