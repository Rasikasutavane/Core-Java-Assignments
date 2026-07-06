package Scanner;
import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {
		
	
 Scanner sc=new Scanner(System.in);
  System.out.println(" enter number to reverse:");
  int n=sc.nextInt();
  int org=n;
  int rev=0;
  while(n!=0) {
	  int m=n%10;
	  rev=rev*10+m;
	  n=n/10;
  }System.out.println("reverse"+rev);
  if(org==rev) {  System.out.println("this is palidrome");
  }
  sc.close();
	}
	
	}
