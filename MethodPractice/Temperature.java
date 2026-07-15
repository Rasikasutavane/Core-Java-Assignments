package practice;
import java.util.Scanner;
public class Temperature {
public double t( double te) {
	double  F = (te * 9 / 5) + 32;
	return F;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
 System.out.println(" Enter Temperature in celcius");
 double c=sc.nextDouble();
 Temperature tt=new Temperature();
 System.out.println(" Celsius (°C) to Fahrenheit (°F) is:"+tt.t(c)+"°F");
 sc.close();
	}

}
