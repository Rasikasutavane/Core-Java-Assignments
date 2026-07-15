package practice;
import java.util.Scanner;
public class Recharge {
	public String rc( int choice) {
		if(choice == 1) {
		    return "Recharge Succesful...\n Plan Details\n ₹199 Plan\n1.5GB/day\n28 Days";
		}
		else if(choice == 2) {
		    return "Recharge Succesful...\n Plan Details\n₹299 Plan\n2GB/day\n28 Days";
		}
		else if(choice == 3) {
		    return "Recharge Succesful...\n Plan Details\n₹399 Plan\n2.5GB/day\n56 Days";
		}
		else if(choice == 4) {
		    return "Recharge Succesful...\n Plan Details\n₹599 Plan\n3GB/day\n84 Days";
		}
		else {
		    return "Invalid Plan";
		}
		
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	Recharge re= new Recharge();
	System.out.println("Mobile Recharge");
	System.out.println("1. ₹199 Plan");
	System.out.println("2. ₹299 Plan");
	System.out.println("3. ₹399 Plan");
	System.out.println("4. ₹599 Plan");
	System.out.println("5. Exit");

	System.out.print("Choose Plan: ");
	int choice = sc.nextInt();
	if(choice == 5) {
	    System.out.println("Thank You!");
	} else {
	    System.out.println(re.rc(choice));
	}
	sc.close();
}
}
