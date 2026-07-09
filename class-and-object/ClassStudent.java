package classandobjects;

public class ClassStudent {

	String name;
	long prn;
    String city;
    
    int attendance;
    long mobNo;
    
    void display() {
    	System.err.println("------Students Information------");
    	System.out.println(" Name Of Student :"+name);
    	System.out.println(" PRN :"+prn);
    	System.out.println(" City :"+city);
    	System.out.println(" Attendance :"+attendance);
    	System.out.println(" Mobile No. :"+mobNo);
    }
	
}
