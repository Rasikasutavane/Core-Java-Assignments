package Scanner;
import java.util.Scanner;
public class Arearectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			System.out.println(" Enter Length ");
			int l= sc.nextInt();
			System.out.println(" Enter width");
			int w= sc.nextInt();
			System.out.println(" Area Of Rectangle is : "+(l*w));
			sc.close();
	}

}
