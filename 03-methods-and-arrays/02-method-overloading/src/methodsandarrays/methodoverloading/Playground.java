/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : 03-Methods and Arrays
 * Lesson     : 02-Method Overloading
 * File       : Playground.java
 * Package    : methodsandarrays.methodoverloading
 * Description: Explore method overloading, overload resolution,
 *              and widening primitive conversion.
 * ============================================================
 */

package methodsandarrays.methodoverloading;

public class Playground {

    public static void display(long number) {
        System.out.println("long");
    }

    public static void display(double number) {
        System.out.println("double");
    }

    public static void main(String[] args) {

        /*
         * ========================================================
         * Experiment 01
         * ========================================================
         *
         * Purpose:
         * Test overload resolution when an int argument can be
         * widened to both long and double.
         *
         * Expected Observation:
         * display(long) should be selected.
         */

        display(10);

        /*
         * ========================================================
         * Experiment 02
         * ========================================================
         *
         * Purpose:
         * Test an ambiguous overload situation.
         *
         * Example:
         *
         * display(float)
         * display(double)
         *
         * display(10);
         *
         * Expected Observation:
         * Compile-time error because Java cannot select a unique
         * most specific method between float and double.
         *
         * This experiment is kept as a commented example because
         * the code would prevent the Playground from compiling.
         */

        /*
        public static void display(float number) {
            System.out.println("float");
        }

        public static void display(double number) {
            System.out.println("double");
        }

        display(10);
        */

        /*
         * ========================================================
         * Experiment 03
         * ========================================================
         *
         * Purpose:
         * Test overload resolution when long, float, and double
         * are available for an int argument.
         *
         * Expected Observation:
         * display(long) should be selected.
         */

        /*
        public static void display(long number) {
            System.out.println("long");
        }

        public static void display(float number) {
            System.out.println("float");
        }

        public static void display(double number) {
            System.out.println("double");
        }

        display(10);
        */

        /*
         * ========================================================
         * Experiment 04
         * ========================================================
         *
         * Purpose:
         * Test widening conversion from byte when long and double
         * overloads are available.
         *
         * Expected Observation:
         * display(long) should be selected.
         */

        byte value = 10;
        display(value);
    }
}

/*
 * ============================================================
 * Experiment Summary
 * ============================================================
 *
 * 1. Direct type matching is preferred when available.
 *
 * 2. Primitive widening conversions can be used during
 *    overload resolution.
 *
 * 3. byte and short can be widened to int.
 *
 * 4. float can be widened to double.
 *
 * 5. Some combinations of overloads can produce an
 *    ambiguous method call.
 *
 * 6. The closest applicable widening conversion may be selected
 *    when Java can determine a unique best match.
 */