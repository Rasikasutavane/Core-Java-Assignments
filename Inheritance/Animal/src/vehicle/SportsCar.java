package vehicle;

public class SportsCar extends Car {
  public void ready() {
	  System.out.println("Sports Car launched successfully");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SportsCar sc= new SportsCar();
sc.start();
sc.drive();
sc.ready();
	}

}
