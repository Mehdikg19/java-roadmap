/*
 * ============================================================
 * Repository : java-roadmap
 * Topic      : Variables and Data Types
 * File       : Exercise02.java
 * Description: Store and display book information using variables.
 * Author     : Mehdi
 * ============================================================
 */

package fundamentals;

public class Exercise02 {

    public static void main(String[] args) {

        String title = "Clean Code";
        String author = "Robert C. Martin";
        int pages = 464;
        double price = 35.99;
        boolean available = true;

        System.out.println("Book Information");
        System.out.println("----------------");
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Pages      : " + pages);
        System.out.println("Price      : $" + price);
        System.out.println("Available  : " + available);

    }

}

/*
 * ============================================================
 * Expected Output
 * ------------------------------------------------------------
 * Book Information
 * ----------------
 * Title      : Clean Code
 * Author     : Robert C. Martin
 * Pages      : 464
 * Price      : $35.99
 * Available  : true
 * ============================================================
 */