package practice;

import java.util.Scanner;

public class ATM {

    int balance = 1000;

    public int deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid Amount");
        }
        return balance;
    }

    public int withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }

    public int checkbalance() {
        return balance;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM a = new ATM();

        while (true) {
             System.out.println(" Enter Number To perform Action ");
            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");

            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("Enter Amount To Deposit:");
                int m = sc.nextInt();
                System.out.println("Total Balance: " + a.deposit(m));

            } else if (n == 2) {
                System.out.println("Enter Amount To Withdraw:");
                int k = sc.nextInt();
                System.out.println("Total Balance: " + a.withdraw(k));

            } else if (n == 3) {
                System.out.println("Total Balance: " + a.checkbalance());

            } else if (n == 4) {
                System.out.println(" Exit.........!\nThank You For Visiting...");
                break; // Exit the loop

            } else {
                System.out.println("Enter Valid Action");
            }
        }

        sc.close(); 
    }
}
