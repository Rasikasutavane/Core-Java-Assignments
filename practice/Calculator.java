package practice;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner ( System.in);
       
    
        	System.out.println(" Actions To Perform ");
        	System.out.println("1.Addition ");
        	System.out.println("2.subtraction ");
        	System.out.println("3.Multiplicationo");
        	System.out.println("4.Division");
        	
        	System.out.println("Enter Choice");
        	int choice =sc.nextInt();
        
		switch (choice) {

	    case 1:
	        System.out.println(" enter Number 1");
	        int n=sc.nextInt();
	        System.out.println(" enter Number 2");
	        int n1=sc.nextInt();
	        System.out.println(" Addition is :"+(n+n1));
	        break;

	    case 2:
	    	 System.out.println(" enter Number 1");
		        int n11=sc.nextInt();
		        System.out.println(" enter Number 2");
		        int n111=sc.nextInt();
		        System.out.println(" Subtraction is :"+(n11-n111));
	      
	        break;

	    case 3:
	    	 System.out.println(" enter Number 1");
		        int n1111=sc.nextInt();
		        System.out.println(" enter Number 2");
		        int n11111=sc.nextInt();
		        System.out.println(" Multiplication is :"+(n1111*n11111));	     
		        break;


	    case 4:
	    	 System.out.println(" enter Number 1");
		        int m=sc.nextInt();
		        System.out.println(" enter Number 2");
		        int o=sc.nextInt();
		        System.out.println(" Division is :"+(m/o));	        break;

	  
	    default:
	      System.out.println(" Enter Valid Choice");
	}
sc.close();
	}

}
