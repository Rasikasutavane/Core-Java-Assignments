package ecapsulation;
import java.util.Scanner;


public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        BankAccount a = new BankAccount();
	        System.out.println(" Enter tour Account No.");
	           int an=sc.nextInt();
	          a.setAcno(an) ;
               
	        while (true) {
	             System.out.println(" Enter Number To perform Action ");
	            System.out.println("\n1.Deposit");
	            System.out.println("2.Withdraw");
	            System.out.println("3.Check Balance");
	            System.out.println("4.Exit");

	            int n = sc.nextInt();

	            if (n == 1) {
	                System.out.println("Enter Amount To Deposit:");
	                long m = sc.nextLong();
	               a.deposit(m);
	                System.out.println("Total Balance: "+a.getBalance());

	            } else if (n == 2) {
	                System.out.println("Enter Amount To Withdraw:");
	                long k = sc.nextLong();
	                a.withdraw(k);
	                System.out.println("Total Balance: " +a.getBalance());

	            } else if (n == 3) {
	                System.out.println("Total Balance: " + a.getBalance());

	            } else if (n == 4) {
	                System.out.println(" Exit.........!\nThank You ");
	                break; 

	            } else {
	                System.out.println("Enter Valid Action");
	            }
	        }

	 sc.close();
	}

}
