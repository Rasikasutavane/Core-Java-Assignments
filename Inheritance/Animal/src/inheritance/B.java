package inheritance;

public class B extends A{
	public void showb() {
		System.out.println(" Class B");
	}
public static void main(String[] args) {
	B b=new B();
	b.show();
	b.showb();
}
	
}
