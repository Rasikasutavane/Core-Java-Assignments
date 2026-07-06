
//Take two numbers from user and print their addition.

package Scanner;
import  java.util.Scanner;
public class TwoNumbers {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number 1: ");
	 int a=sc.nextInt();
	 System.out.println("Enter number 2: ");
	 int b=sc.nextInt();
	 System.out.println("Addition of "+a+"+"+b+"-->"+(a+b));
	 
		sc.close();
	}
}

