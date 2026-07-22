package plymorphism;
//Return type alone cannot differentiate overloaded methods. The parameter list must be different.
public class Returntype {

	  int add(int a, int b) {
	        return a + b;
	    }

	    double add(int a, int b) {
	        return a + b;}
	    }
	public static void main(String[] args) {
	System.out.println("Return type alone cannot differentiate overloaded methods. The parameter list must be different.");	
	}

}
