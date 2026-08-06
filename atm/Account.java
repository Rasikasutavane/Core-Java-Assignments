package atm;

public abstract class Account implements Transaction {
	private double balance=5000;
	private int pin;
	
	  public Account(int pin) {
	        this.pin = pin;
	    }
	final void enteredPin( int userPin) {
		if( pin==userPin) {
			System.out.println(" Correct Pin Entered");
		}
		else {
			System.err.println(" Inavalid pin");
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getpin() {
		return pin;
	}
	public void setpin(int pin) {
		this.pin = pin;}

	public void deposit(double amount) {
		if( amount >0) {
			this.balance =balance+amount;
			System.out.println(" Amount deposited : "+amount);
			System.out.println(" Updated Balance: "+balance);
		}
		else {
			System.err.println(" Enter valid Amount to deposit");
		}
		
	}
 
	public void checkBalance() {
		 System.out.println("Balance : " + balance);
	}
		
	abstract public void withdraw(double amount);
		}

		

