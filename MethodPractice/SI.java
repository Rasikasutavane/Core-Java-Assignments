package practice;
import java.util.Scanner;
public class SI {
	public double si(double p,double r, double t ) {
		double s= (p*r*t)/100;
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter Principal To calculate Simple Interest");
		int p=sc.nextInt();
		System.out.println(" enter Rate To calculate Simple Interest");
		int r=sc.nextInt();
		System.out.println(" enter time To calculate Simple Interest");
		int t=sc.nextInt();
		SI s=new SI();
		System.out.println(" SI: "+s.si(p, r, t));
		sc.close();
	}

}
