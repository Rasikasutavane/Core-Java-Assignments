package atm;

public class Current extends Account{
	   public Current(int pin) {
	        super(pin);
	    }
	@Override
	public void withdraw(double amount) {
	if( amount<getBalance()&& amount>0&&amount<=30000) {
	double   newBalance=amount-getBalance();
	System.out.println("WithDRAWAL SUCCESSFULL ");
	System.out.println(" Total Balance "+newBalance);
	}
	else {
	System.err.println("Invalid Amount or Insufficient Amount");	
	}
	}


}
