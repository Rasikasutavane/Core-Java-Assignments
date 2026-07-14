package methods;

public class Square {
 
 public void square(int a) {
	System.out.println("parameterised");
	System.out.println("Square :"+(a*a));
 }
  int c;
  public void sq1() {
	  System.out.println("non parameterised ");
	  System.out.println("Square :"+(c*c));
  }
  int d;
  public int sq2() {
	  System.out.println("--------------------------------");
	  System.out.println("non parameterised ,Return Type ");
	  return d*d;
  }
  public int sq3( int e) {
	  System.out.println("------------------------------------");
	  System.out.println(" parameterised ,Return Type ");
	  return e*e;
  }
}
