package atm;

public class Savings extends Account {
	
	 public Savings(int pin) {
	        super(pin);
	    }
	@Override
	public void withdraw(double amount) {	
		if( amount>0&&amount<getBalance()&&amount<=2000) {
			double newBalance=getBalance()-amount;
		System.out.println("WITHDRAWAL SUCCRESFULL ");
		System.out.println(" Balance :"+newBalance);
		}
		else {
			System.out.println(" Invalid Amount or Insufficient Amount");
		}
	}

 }
