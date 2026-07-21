package ecapsulation;


public class Car {

    private int carId;
    private String carName;
    private double price;
    private int quantity;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        if(carId > 0) {
            this.carId = carId;
        }
        else {
            System.out.println("Invalid Car ID");
        }
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        if(carName != null && !carName.isEmpty()) {
            this.carName = carName;
        }
        else {
            System.out.println("Invalid Car Name");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
        else {
            System.out.println("Invalid Price");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0) {
            this.quantity = quantity;
        }
        else {
            System.out.println("Invalid Quantity");
        }
    }

    public double calculateBill() {
        return price * quantity;
    }

    public void displayCar() {
        System.out.println("Car ID: " + carId);
        System.out.println("Car Name: " + carName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + calculateBill());
    }
}