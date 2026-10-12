/*
 * ============================================================
 * Java Roadmap Project
 * Topic      : OOP Basics
 * Lesson     : Static Members
 * File       : Exercise02.java
 * Package    : oopbasics.staticmembers
 * Description: Demonstrating static and instance members
 *              in a bank account management example.
 * ============================================================
 */

package oopbasics.staticmembers;

public class Exercise02 {

    String accountNumber;
    double balance;

    static int totalAccounts = 0;

    public Exercise02(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void displayTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {

        Exercise02 accountNum1 = new Exercise02("ACC-101", 1500.0);
        Exercise02 accountNum2 = new Exercise02("ACC-102", 2500.0);
        Exercise02 accountNum3 = new Exercise02("ACC-103", 3500.0);

        accountNum1.displayAccountInfo();
        System.out.println();

        accountNum2.displayAccountInfo();
        System.out.println();

        accountNum3.displayAccountInfo();
        System.out.println();

        Exercise02.displayTotalAccounts();
    }
}

/*
 * =====================
 * Expected Output
 * =====================
 * Account Number: ACC-101
 * Balance: 1500.0
 *
 * Account Number: ACC-102
 * Balance: 2500.0
 *
 * Account Number: ACC-103
 * Balance: 3500.0
 *
 * Total Accounts: 3
 */