
package practice;
import java.util.Scanner;
public class Bill {
public int  discount(int b) {
	if(b >5000) {
		  int discount = b * 10 / 100;
	        System.out.println(" Eligible for 10% Discount🍟🍟🏷️🎉🎊🎊");
	        System.out.println(" Discount = ₹" + discount);

	        return b - discount; 
	} else {
		System.out.println("No Discount");
        System.out.println("Shop for at least ₹5000 to get 10% discount.");
return b;		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in);
		int total=0;
		Bill b= new Bill();
		while(true) {
		System.out.println("------ Product List -----");
		System.out.println(" 1.Farm House Pizza --- 500₹");
		System.out.println(" 2.Farm House Pizza(Cheese Burst)  --- 700₹");
		System.out.println(" 3.Veg Loaded Pizza --- 500₹");
		System.out.println(" 4.Veg Loaded Pizza(Cheese Burst) --- 700₹");
		System.out.println(" 5.Pizza Pack(2 Large pizza + coke) --- 2000₹");
		System.out.println(" 6.Pizza Burger Pack(2 Pizza + Burger+ 2 Coke) --- 3000₹");
		System.out.println(" 7.Coke + Lava Cake --- 500₹");
		System.out.println(" 8. done with Ordering!!");
		int n=sc.nextInt();
		if( n==1)
		{       System.out.print("Enter Quantity: ");
         int m = sc.nextInt();
           total = total+m*500;}

		else if( n==2)
		{
         System.out.print("Enter Quantity: ");
         int m= sc.nextInt();
         total =total+m*700;}
		
	   else if( n==3)
	{  System.out.print("Enter Quantity: ");
	 int m= sc.nextInt();
     total =total+m*500;}

else if( n==4)
{
 System.out.print("Enter Quantity: ");
 int m= sc.nextInt();
 total =total+m*700;}

else if( n==5)
{
	 System.out.print("Enter Quantity: ");
	 int m= sc.nextInt();
      total =total+m*2000;
	 }
else if( n==6)
{
 System.out.print("Enter Quantity: ");
 int m= sc.nextInt();
 total =total+m*3000;}	
	
		else if( n==7)
		{
		 System.out.print("Enter Quantity: ");
		 int m= sc.nextInt();
         total =total+m*500;}	
			
		
	else {
		System.out.println(" Your Order Will Be Pack Soon!!!");
		break;
	}
		
		}
		
		System.out.println(" Total Bill--- "+total+"₹");
		int finalTotal=b.discount(total);
		System.out.println(" Final Amount --- "+finalTotal);
		sc.close();
		}
	}


