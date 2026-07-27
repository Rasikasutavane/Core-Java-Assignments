package practice;
import java.util.Scanner;
public class Armstrong {
 public boolean isArmstrong(int n) {
	 int org=n;
	 int add=0;
	 while( n!=0) {
		 int m= n%10;
		 add=add+(m*m*m);
		 n=n/10;	 
	 }
	 if( org==add) {
		 System.out.println(" Original Number is:"+org+" After Calculation(Adding cubes of numbers)we get :"+add);
		return true;
	 }
	 else {
		 System.out.println(" Original Number is:"+org+" After Calculation(Adding cubes of numbers)we get :"+add);
		 return false;
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner( System.in);
  Armstrong am= new Armstrong();
  System.out.println(" Enter Number That You Want To Check :");
  int n=sc.nextInt();
  System.out.println("Given Number Is Armstrong :"+am.isArmstrong(n) );
	sc.close();}

}
