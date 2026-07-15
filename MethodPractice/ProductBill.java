package practice;
import java.util.Scanner;
public class ProductBill {

    public double bill(String item, int quantity) {

        double price = 0;

        if (item.equals("Pizza")) {
            price = 250;
        } else if (item.equals("Burger")) {
            price = 120;
        } else if (item.equals("Sandwich")) {
            price = 100;
        } else if (item.equals("Pasta")) {
            price = 180;
        } else {
            System.out.println("Item Not Available");
            return 0;
        }

        return price * quantity;
        
    }
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 ProductBill obj = new ProductBill();
         System.out.println("------ MENU ------");
         System.out.println("Pizza     - ₹250");
         System.out.println("Burger    - ₹120");
         System.out.println("Sandwich  - ₹100");
         System.out.println("Pasta     - ₹180");

         System.out.print("\nEnter Item Name: ");
         String item = sc.next();

         System.out.print("Enter Quantity: ");
         int quantity = sc.nextInt();

         double total = obj.bill(item, quantity);

         System.out.println("\n------ FOOD BILL ------");
         System.out.println("Item : " + item);
         System.out.println("Quantity : " + quantity);
         System.out.println("Total Bill : ₹" + total);

         sc.close();
	}
}