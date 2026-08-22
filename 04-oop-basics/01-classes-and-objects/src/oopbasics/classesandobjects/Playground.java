/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : Classes and Objects
 * Lesson     : 01 - Classes and Objects
 * File       : Playground.java
 * Package    : oopbasics.classesandobjects
 * Description: Explores object state, multiple objects, and
 *              reference variables through practical experiments.
 * ============================================================
 */

package oopbasics.classesandobjects;

class Cars {

    String brand;
}

public class Playground {

    public static void main(String[] args) {

        /*
         * Experiment 01:
         * Two objects created from the same class have
         * independent state.
         */

        Cars car1 = new Cars();
        Cars car2 = new Cars();

        car1.brand = "Toyota";
        car2.brand = "BMW";

        car1.brand = "Honda";

        System.out.println("Experiment 01:");
        System.out.println("car1.brand: " + car1.brand);
        System.out.println("car2.brand: " + car2.brand);

        /*
         * Expected Observation:
         *
         * car1.brand: Honda
         * car2.brand: BMW
         *
         * Explanation:
         * car1 and car2 refer to two different objects.
         * Changing the state of one object does not change
         * the state of the other object.
         */


        /*
         * Experiment 02:
         * Two reference variables can refer to the same object.
         */

        Car car3 = new Car();
        Car car4 = car3;

        car3.brand = "Toyota";

        System.out.println();
        System.out.println("Experiment 02:");
        System.out.println("car3.brand: " + car3.brand);
        System.out.println("car4.brand: " + car4.brand);

        /*
         * Expected Observation:
         *
         * car3.brand: Toyota
         * car4.brand: Toyota
         *
         * Explanation:
         * car3 and car4 are two different reference variables,
         * but both refer to the same Car object.
         *
         * No new object is created by:
         *
         * Car car4 = car3;
         *
         * The reference is assigned to another variable.
         */


        /*
         * Experiment 03:
         * Counting objects and reference variables.
         */

        Car firstCar = new Car();
        Car secondCar = new Car();
        Car thirdCar = firstCar;

        /*
         * Object count:
         *
         * new Car() → Object #1
         * new Car() → Object #2
         *
         * Total objects: 2
         *
         * Reference variables:
         *
         * firstCar
         * secondCar
         * thirdCar
         *
         * Total reference variables: 3
         *
         * Relationship:
         *
         * firstCar  ──┐
         *             ├──→ Object #1
         * thirdCar  ──┘
         *
         * secondCar ─────→ Object #2
         *
         * Key observation:
         *
         * new → creates a new object
         * reference assignment → copies the reference
         */
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Experiment 01:
 * car1.brand: Honda
 * car2.brand: BMW
 *
 * Experiment 02:
 * car3.brand: Toyota
 * car4.brand: Toyota
 */