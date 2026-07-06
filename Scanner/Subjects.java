package Scanner;
import java.util.Scanner;
public class Subjects {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

        System.out.print("Enter first Subject: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Subject: ");
        int b = sc.nextInt();

        System.out.print("Enter Third Subject: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth Subject: ");
        int d = sc.nextInt();

        System.out.print("Enter fifth Subject: ");
        int e = sc.nextInt();
         
        System.out.println("Total:"+(a+b+c+d+e));
        int total=(a+b+c+d+e);
        double per=(total/500.0)*100;
        System.out.println("Percentage:"+(per ));
        sc.close();
	}

}
