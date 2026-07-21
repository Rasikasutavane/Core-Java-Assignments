package ecapsulation;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter Your Information");
		System.out.println(" Name");
		String name=sc.nextLine();
		System.out.println(" Roll No.");
		int rollNo=sc.nextInt();
		System.out.println(" Marks");
		int marks =sc.nextInt();
		Student std=new Student ();
		std.setName(name);
		std.setMarks(marks);
		std.setRoll(rollNo);

		System.out.println("--------------------");
		System.out.println(std.getName());
		System.out.println(std.getRoll());
		System.out.println(std.getMarks());
		sc.close();
	}

}
