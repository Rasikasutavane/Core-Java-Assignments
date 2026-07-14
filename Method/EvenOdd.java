package methods;

public class EvenOdd {

	
	public void evenOdd(int a) {
		System.out.println(" Parameterised without return type");
		if(a%2==0) {
		System.out.println(" Even: "+a);}
		else {System.out.println("Odd :"+a);}
	}
	
	int c;
	public void eo1() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Non Parameterised without return type");
		if (c%2==0) {
			System.out.println("Even :"+c);
		}
		else { System.out.println("Odd : ");}
	}

int e;
public String eo2() {
	System.out.println("--------------------------------------------------------------------");
	System.out.println("Non Parameterised with return type");
	if (e%2==0) {
		return "Even" ;	}
	else { return "Odd";}
}
public String eo3(int f) {
	System.out.println("--------------------------------------------------------------------");
	System.out.println("Non Parameterised with return type");
	if (f%2==0) {
		return "Even" ;	}
	else { return "Odd";}
}	
	

}