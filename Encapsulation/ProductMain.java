package ecapsulation;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product pr = new Product();

        System.out.println("Enter product info");

        System.out.println("Product Name:");
        String name = sc.nextLine();
        pr.setProductName(name);

        System.out.println("Product ID:");
        int id = sc.nextInt();
        pr.setProductId(id);

        System.out.println("Product Quantity:");
        int quantity = sc.nextInt();
        pr.setQuantity(quantity);

        System.out.println("Product Price:");
        long price = sc.nextLong();
        pr.setPrice(price);

        System.out.println("\n----- Product Details -----");

        System.out.println("Product Name : " + pr.getProductName());
        System.out.println("Product ID   : " + pr.getProductId());
        System.out.println("Price        : " + pr.getPrice());
        System.out.println("Quantity     : " + pr.getQuantity());

        sc.close();
    }
}