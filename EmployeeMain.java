package ecapsulation;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner( System.in);
 System.out.println(" Enter your Information");
 System.out.println(" Enter your Name");
 String name=sc.nextLine();
 System.out.println(" Enter your Id");
 int id=sc.nextInt();
 System.out.println(" Enter your Monthly Salary");
 double salary=sc.nextDouble();
 Employee em=new Employee();
 em.setName(name);
 em.setId(id);
 em.setSalary(salary);
 System.out.println("--------------------------------------------");
 System.out.println("Name   : " + em.getName());
 System.out.println("ID     : " + em.getId());
 System.out.println("Salary : " + em.getSalary());
 sc.close();
	}

}
