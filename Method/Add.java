package methods;

public class Add {
 public void add(int a, int b) {
	 System.out.println(" this is parameterised No Return Type");
	 System.out.println("Addition of "+a+"+"+b+"-->"+(a+b));
 }
 int c;
 int d;
 public void add1() {
	 System.out.println("--------------------------------");
	 System.out.println(" This is non parameterised  No Return Type");
	 System.out.println("Addtion of a &b is"+(c+d));
 }
 
 public long add2(long a, long b) {
	 System.out.println("--------------------------------");
	 System.out.println(" this is parameterised With Return Type");
	
	 return a+b;
 }
 long e;
 long f;
 public long add3() {
	 System.out.println("--------------------------------");
	 System.out.println(" this is Non-parameterised With Return Type");
	 return e+f;
 }
 
 
}
