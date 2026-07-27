package practice;
import java.util.Scanner;
public class Grade {
   public String grade(double n) {
	   if (n>=75) {
		   return "A";	   }
    
   else if( n>=60 &&n<75) {
	   return "B";
   }
   else if( n>=40&& n<60) {
	   return "C";}
   else {
	   System.err.println(" Fail");
	   return" F(fail)";
   }
   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner( System.in);
        Grade gr= new Grade();
        System.out.println(" Enter Your name :");
        String name=sc.nextLine();
        System.out.println(" Enter Maths Marks");
        int m= sc.nextInt();
        System.out.println(" Enter Science Marks");
        int n=sc.nextInt();
        System.out.println(" Enter Sst Marks");
        int o=sc.nextInt();
        int total =m+n+o;
        double avg=(total/300.0)*100;
        System.out.println("------- Students Marksheet------- ");
        System.out.println("Name : "+name);
        System.out.println("Maths : " +m );
        System.out.println("Science : " +n);
        System.out.println("SST : " +o);
        System.out.println("Total Marks : " +total);
        System.out.println("Percentage : "+ avg);
        System.out.println(" Result --\n Final Grade : "+gr.grade(avg));
        sc.close();

	}

}
