package classandobjects;

public class BankAccount {
String name;
String bname;
long ano;
float bal;

void displayBalance() {
	System.err.println("----------Bank Details---------");
	System.out.println("Account Holder Name:"+name);
	System.out.println("Bank name :"+ bname);
	System.out.println("Account Number:"+ano);
	System.out.println("Balance :"+bal);
}
}
