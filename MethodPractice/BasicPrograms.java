package practice;

import java.util.Scanner;

public class BasicPrograms {

    public int maximum(int a, int b, int c) {

        if(a > b && a > c) {
            return a;
        }
        else if(b > a && b > c) {
            return b;
        }
        else {
            return c;
        }
    }

    // Prime number without is
    public boolean primeNumber(int n) {

        int count = 0;

        for(int i = 1; i <= n; i++) {

            if(n % i == 0) {
                count++;
            }
        }

        if(count == 2) {
            return true;
        }
        else {
            return false;
        }
    }

    // Palindrome number without is
    public boolean palindromeNumber(int n) {

        int original = n;
        int reverse = 0;

        while(n != 0) {

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if(original == reverse) {
            return true;
        }
        else {
            return false;
        }
    }


    public String checkEvenOdd(int n) {

        if(n % 2 == 0) {
            return "Even Number";
        }
        else {
            return "Odd Number";
        }
    }


    public String calculateGrade(int marks) {

        if(marks >= 90) {
            return "Grade A";
        }
        else if(marks >= 75) {
            return "Grade B";
        }
        else if(marks >= 60) {
            return "Grade C";
        }
        else {
            return "Grade D";
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BasicPrograms obj = new BasicPrograms();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.println("Maximum: " + obj.maximum(a, b, c));


        System.out.print("Enter number for prime check: ");
        int prime = sc.nextInt();

        if(obj.primeNumber(prime)) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }


        System.out.print("Enter number for palindrome check: ");
        int pal = sc.nextInt();

        if(obj.palindromeNumber(pal)) {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome");
        }


        System.out.print("Enter number for even odd check: ");
        int num = sc.nextInt();

        System.out.println(obj.checkEvenOdd(num));


        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.println(obj.calculateGrade(marks));

        sc.close();
    }
}