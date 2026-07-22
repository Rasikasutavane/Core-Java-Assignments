package plymorphism;

public class TestOverloading {
	 static void print(int a) {
	        System.out.println(a);
	    }

	    static void print(int a, int b) {
	        System.out.println(a + " " + b);
	    }
	public static void main(String[] args) {
		
		
	print(5454);
	print(77, 88);
	
	}

}
