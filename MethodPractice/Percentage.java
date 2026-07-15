package practice;
import java.util.Scanner;
public class Percentage {

	public double perc(float m1,float m2,float m3) {
		float total=m1+m2+m3;
		float p=(total/300.0f)*100;
		
		return p;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percentage pr=new Percentage();
		Scanner sc= new Scanner (System.in);
		System.out.println(" Enter Marks For Each Subject");
		System.out.println(" Maths :");
		float n1=sc.nextFloat();
		System.out.println(" Science :");
		float n2=sc.nextFloat();
		System.out.println(" SST :");
		float n3=sc.nextFloat();
		System.out.println("Percentage :"+pr.perc(n1, n2, n3)+"%");
        sc.close();
	} 

}
