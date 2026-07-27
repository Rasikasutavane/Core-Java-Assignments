package practice;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);

		System.out.println(" Enter number");
		int n=sc.nextInt();//222
		System.out.println(" Enter number");
		int n1=sc.nextInt();//222
		System.out.println(" Enter number");
		int m=sc.nextInt();//222
		System.out.println(" Enter number");
		int m1=sc.nextInt();//222
		if( n>=n1&&n>=m&&n>=m1) {
			System.out.println(n);
		}else if( n1>=n&&n1>=m&&n1>=m1) {
			System.out.println(n1);
		}else if(m>n&&m>=m1&&m>=n1) {
			System.out.println(m);
		}
		else {
			System.out.println(m1);
		}
		sc.close();
	}

}
