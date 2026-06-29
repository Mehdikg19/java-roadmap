/*
 * ============================================================================
 * Project     : Java Roadmap
 * Module      : 03 - Type Casting
 * File        : Exercise01.java
 * Topic       : Implicit and Explicit Type Casting
 * Description : Practice automatic and manual type conversion.
 * Author      : Mehdi
 * ============================================================================
 */

package fundamentals.typecasting;

public class Exercise01 {

    public static void main(String[] args) {

        double temperature = 36.8;
        int convertedTemperature = (int) temperature;

        int number = 150;
        double convertedNumber = number;

        System.out.println("temperature = " + temperature);
        System.out.println("convertedTemperature = " + convertedTemperature);
        System.out.println("number = " + number);
        System.out.println("convertedNumber = " + convertedNumber);

    }
}

/*
 * ============================================================================
 * Expected Output
 * ============================================================================
 * temperature = 36.8
 * convertedTemperature = 36
 * number = 150
 * convertedNumber = 150.0
 * ============================================================================
 */