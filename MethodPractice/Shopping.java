package practice;
import java.util.Scanner;

public class Shopping {
public double cart(double p1, double p2,double p3) {
	return p1+p2+p3;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         System.out.println(" Enter Amount for Each product");
         System.out.println(" 1 st product in ₹");
         double p1=sc.nextDouble();
         System.out.println(" 2 nd product in ₹");
         double p2=sc.nextDouble();
         System.out.println(" 3 rd product in ₹");
         double p3=sc.nextDouble();
         Shopping sp=new Shopping();
         System.out.println(" Total Cart Value "+sp.cart(p1, p2, p3));
         sc.close();
	}

}
