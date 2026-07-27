package practice;

public class Area {

	
	public void area( int l, int b) {
		System.out.println(" Area of Rectangle "+ l*b);
		
	}
	public void area( double r) {
		System.out.println(" Area of circle "+ 3.14*(r*r));
		
	}
	public void area( double b1,int height) {
		System.out.println(" Area of circle "+ b1*height);
		
	}
	public static void main(String[] args) {
		Area a=new Area();
a.area(8);
a.area(77, 990);
a.area(77, 55);
	}

}
