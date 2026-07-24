package vehicle;

public class Car extends Vehicle {
	public void drive() {
		System.out.println(" Drives car Safely");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c= new Car();
		c.start();
		c.drive();
		
}

}
