package methods;

public class EvenOdd {

	
	public void evenOdd(int a) {
		System.out.println(" Parameterised");
		if(a%2==0) {
		System.out.println(" Even: "+a);}
		else {System.out.println("Odd :"+a);}
	}
	int c;
	public void eo1() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Non Parameterised");
		if (c%2==0) {
			System.out.println("Even :"+c);
		}
		else { System.out.println("Odd : ");}
	}
}
