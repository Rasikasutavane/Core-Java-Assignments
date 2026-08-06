package atm;

public class AtmMain {

	public static void main(String[] args) {
		
		        Account a ;

		        a = new Savings(1234);

		        a.enteredPin(1234);

		        a.deposit(5000);

		        a.withdraw(1000);

		        a.checkBalance();


		        System.out.println("----------------");

		        a = new Current(5678);

		        a.enteredPin(5678);

		        a.deposit(10000);

		        a.withdraw(5000);

		        a.checkBalance();

		    }
		}