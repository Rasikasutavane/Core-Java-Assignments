package practice;
import java.util.Scanner;

public class Discount {
	
	    public double discount(double price, double percent) {

	        double finalPrice = price - (price * percent / 100);

	        return finalPrice;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Product Price: ");
	        double p = sc.nextDouble();

	        System.out.print("Enter Discount Percentage: ");
	        double per = sc.nextDouble();

	        Discount d = new Discount();

	        System.out.println("Final Price = " + d.discount(p, per));

	        sc.close();

	}

}
