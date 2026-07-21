package ecapsulation;

public class BankAccount {
	
private double balance=5000;
private int acno;

public double getBalance() {
	return balance;
}

public int getAcno() {
	return acno;
}
public void setAcno(int acno) {
	this.acno = acno;}

public void deposit(long amount) {
	if( amount >0) {
		this.balance =balance+amount;
		
	}
	else {
		System.err.println(" Enter valid Amount to deposit");
	}
	
}
public void withdraw(long amount) {
	if( amount>0&&amount<=balance) {
		this.balance=balance-amount;
		
	}else {
		System.err.println(" Invalid Amount or Insufficient Amount");
	}
	}

	
}

