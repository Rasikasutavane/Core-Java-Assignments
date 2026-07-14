package methods;

public class PrimeMain {
public static void main(String[] args) {
	Prime m1= new Prime();
	m1.p1(55);
	
	Prime m2= new Prime();
	m2.b=88;
	m2.p2();
	
	Prime m3= new Prime();
	m3.c=78;
	System.out.println(m3.p3());
	Prime m4= new Prime();

	System.out.println(m4.p4(89));
}
}
