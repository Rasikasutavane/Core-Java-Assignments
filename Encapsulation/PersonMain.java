package ecapsulation;
import java.util.Scanner;
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
Person p=new Person ();
System.out.println("Information");
System.out.println(" Enter Your Name");
String name=sc.nextLine();
p.setName(name);
System.out.println(" Enter Your Age");
int age= sc.nextInt();
p.setAge(age);
System.out.println("---------------------");
System.out.println(" Name:"+p.getName());
System.out.println(" Age:"+p.getAge());
sc.close();
	}

	
}
