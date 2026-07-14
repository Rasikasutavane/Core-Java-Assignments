package methods;

public class Cube {
 public void c1(int a) {
	 System.out.println(" Parameterized, No Return Type");
	 System.out.println(" Cube of "+a+"="+(a*a*a));
 }
 int b;
 public void c2() {
	 System.out.println("--------------------------------");
	 System.out.println(" non Parameterized, No Return Type");
	 System.out.println(" Cube of "+b+"="+(b*b*b));
 }
 int c;
 public int c3() {
	 System.out.println("--------------------------------");
	 System.out.println(" non Parameterized,Return Type");
	return c*c*c;
 }
 
 public int c4(int e) {
	 System.out.println("--------------------------------");
	 System.out.println(" Parameterized,Return Type");
	return e*e*e;
 }
 
}
