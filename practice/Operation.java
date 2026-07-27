package practice;
import java.util.Scanner;
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner ( System.in);
        System.out.println(" ");
        while(true) {
        	System.out.println(" Actions To Perform ");
        	System.out.println("1.Check Even/Odd ");
        	System.out.println("2.Check Prime");
        	System.out.println("3.Reverse Number");
        	System.out.println("4.Exit");
        	System.out.println(" Enter Choice");
        	int choice =sc.nextInt();
         if(choice==4) {
          break;
         }
         switch(choice) {
         case 1:
        	 System.out.println(" Enter number ");
        	 int n=sc.nextInt();
        	 if(n%2==0) {
        		 System.out.println(" Even ");
        		 System.out.println("_________________________________________________________");
        	 }else {
        		 System.out.println(" Odd ");
        		 System.out.println(" ---------------------------------------------------------------------");
        	 }
        	 break;
         case 2:
        	 int count=0;
        	 System.out.println(" enter Number");
        	 int n1=sc.nextInt();
        	 for(int i=1;i<=n1;i++) {
        		 if( n1%i==0) {
        			 count++;
        		 }
        	 }
        	 if( count==2) {
        		 System.out.println(" prime Number");
        		 System.out.println("_________________________________________________________");
        	 }else {
        		 System.out.println(" Not Prime");
        		 System.out.println("_________________________________________________________");
        	 }
        	 break;
         case 3:
        	 int rev=0;
        	 System.out.println(" enter Number");
        	 int n11=sc.nextInt();
        	 int org=n11;
        	 while(n11!=0) {
        		 int m= n11%10;
        		 rev=rev*10+m;
        		 n11=n11/10;
        	 }
        	 System.out.println(" original number : "+org+"\n Its Reverse : "+rev);
        	 System.out.println("_________________________________________________________");
         
         break;
         default :{
        	 System.out.println(" Enter Valid Choice");
        	 System.out.println("_________________________________________________________");
         }
         }
        }
        sc.close();
	}

}
