package Scanner;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println(" enter Principal To calculate Simple Interest");
int p=sc.nextInt();
System.out.println(" enter Rate To calculate Simple Interest");
int r=sc.nextInt();
System.out.println(" enter time To calculate Simple Interest");
int t=sc.nextInt();
float s= (p*r*t)/100;
System.out.println("Simple Interest : "+s);
 sc.close();
	}

}
