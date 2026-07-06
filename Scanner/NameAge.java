package Scanner;
import java.util.Scanner;
public class NameAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println(" enter Age");
int age=sc.nextInt();
System.out.println(" enter Name");
String name=sc.nextLine();
 
System.out.println(" Age is "+age);
System.out.println( " name is :"+name);

sc.close();
	}

}
