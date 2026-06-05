package methods;

public class Customer {
 
	String name;
	int id;
	int mobno;
	int orderid;
    String  city;
    
    public void show() {
    	System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("City = " + city);
        System.out.println("Order Id = "+ orderid);
    }
	
}
