/*
 * ============================================================
 * Java Roadmap
 * Topic: Operators
 * File: Exercise02.java
 * Description: Playground using comparison and logical operators.
 * Author: Mehdi
 * ============================================================
 */

package fundamentals.operators;

public class Exercise02 {
    public static void main(String[] args) {

    int age = 22;
    int score = 85;

    System.out.println("Age > 18 : " + (age > 18));
    System.out.println("Score == 100 : " + (score == 100));
    System.out.println("Score >= 80 : " + (score >= 80));
    System.out.println("Age < Score : " + (age < score));
    System.out.println("Age != Score : " + (age != score));
    System.out.println("Age + Score / 5 : " + (age + score / 5));
    System.out.println("(Age + Score) / 5 : " + (age + score) / 5);
    System.out.println("Score % Age : " + (score % age));

    }
}

/*
Expected Output:

Age > 18 : true
Score == 100 : false
Score >= 80 : true
Age < Score : true
Age != Score : true
Age + Score / 5 : 39
(Age + Score) / 5 : 21
Score % Age : 19
*/
