package classandobjects;

public class VehicleMain {
public static void main(String[] args) {
	Vehicle car =new Vehicle();
	car.name="BMW X5";
	car.brand="BMW";
	car.price=9540000L;
	car.year=2025;
	car.carNo="MH6567";
	car.showCar();
	Vehicle car1=new Vehicle();
	car1.brand="Hyundai";
	car1.name=" Venue";
	car1.carNo="MH6655";
	car1.price=1200000L;
	car1.year=2022;
	car1.showCar();
			
}
}
