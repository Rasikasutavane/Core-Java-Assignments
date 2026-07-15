package practice;


import java.util.Scanner;

public class Electricity {

    public double bill(int units) {

        if (units <= 100) {
            return units * 5;
        } else if (units <= 200) {
            return units * 7;
        } else {
            return units * 10;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Electricity e = new Electricity();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double total = e.bill(units);

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Units Consumed : " + units);
        System.out.println("Total Bill : ₹" + total);

        sc.close();
    }
}