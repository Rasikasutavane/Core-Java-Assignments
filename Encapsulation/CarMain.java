package ecapsulation;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car c = new Car();

        System.out.println("Enter Car ID:");
        c.setCarId(sc.nextInt());

        sc.nextLine();

        System.out.println("Enter Car Name:");
        c.setCarName(sc.nextLine());

        System.out.println("Enter Car Price:");
        c.setPrice(sc.nextDouble());

        System.out.println("Enter Quantity:");
        c.setQuantity(sc.nextInt());

        System.out.println("\nCar Bill Details:");
        c.displayCar();

        sc.close();
    }
}
