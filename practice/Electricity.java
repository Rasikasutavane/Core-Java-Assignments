package practice;
import java.util.Scanner;
public class Electricity {
    public int calculateElectricityBill( int units) {
    	if( units <=100) {
    		return units*5;
    	}else if( units <=200) {
    		return units*7;	
    	}else {
    		return units*10;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electricity ec=new Electricity();
		Scanner sc= new Scanner( System.in);
		System.out.println("Enter Units Consumed:");
		 int n= sc.nextInt();
		 System.out.println(" ------Electricity Bill-------");
		 System.out.println("Units Consumed : " +n);
		 System.out.println("Total Bill : "+ec.calculateElectricityBill(n));
sc.close();
	}

}
