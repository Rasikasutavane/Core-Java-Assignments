package Scanner;
import java.util.Scanner;
public class ProductBill {

	public static void main(String[] args) {
	           Scanner sc = new Scanner(System.in);

	           System.out.print("How many products did you buy? ");
	           int n = sc.nextInt();

	           double total = 0;

	           System.out.println("\n--------- BILL ---------");

	           for (int i = 1; i <= n; i++) {

	               System.out.print("Enter Product Name: ");
	               String name = sc.next();

	               System.out.print("Enter Product Price: ");
	               double price = sc.nextDouble();

	               total = total + price;

	               System.out.println(name + " = ₹" + price);
	           }

	           System.out.println("------------------------");
	           System.out.println("Total Bill = ₹" + total);

	           sc.close();
	       }
	   }
	   
		
	
