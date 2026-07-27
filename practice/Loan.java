package practice;
import java.util.Scanner ;
public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner( System.in);
       System.out.println("--Check Are you Eligible to Take Loan--");
	System.out.println("Enter Your salary ");
	double n=sc.nextDouble();
	System.out.println("Enter Your Age ");
      int a= sc.nextInt();
	
      if( n>25000 && (a>=21 &&a<=60)) {
    	  System.out.println(" You Are Eligible For Loan");
      }else {
    	  System.err.println(" Not eligible");
      }
      sc.close();
	}

}
