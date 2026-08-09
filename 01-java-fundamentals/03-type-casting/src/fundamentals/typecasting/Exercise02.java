/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 03 - Type Casting
 * File        : Exercise02.java
 * Topic       : Implicit and Explicit Type Casting
 * Description : Practice numeric and character type conversions.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.typecasting;

public class Exercise02 {

    public static void main(String[] args) {

        double salary = 1250.75;
        int wholeSalary = (int) salary;

        char character = 'A';
        int asciiCode = character;

        System.out.println("salary = " + salary);
        System.out.println("wholeSalary = " + wholeSalary);
        System.out.println("character = " + character);
        System.out.println("asciiCode = " + asciiCode);

    }
}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * salary = 1250.75
 * wholeSalary = 1250
 * character = A
 * asciiCode = 65
 * ============================================================================
 */