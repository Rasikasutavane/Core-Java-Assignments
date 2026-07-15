package practice;

import java.util.Scanner;

public class RideBooking {

    public double calculateFare(double distance) {
        double fare;

        if(distance <= 5) {
            fare = distance * 25;
        } else if(distance <= 15) {
            fare = distance * 15;
        } else {
            fare = distance * 10;
        }

        return fare;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RideBooking r = new RideBooking();

        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        double totalFare = r.calculateFare(distance);

        System.out.println("Total Ride Fare: ₹" + totalFare);
        sc.close();
    }
}