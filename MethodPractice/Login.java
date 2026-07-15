package practice;
import java.util.Scanner;
public class Login {
public boolean login(String un,String pw) {
	if(un.equals(un.equals("Rasika@gmail.com")&&pw.equals("1234556"))) {
		return true;
	}else {
		return false;
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Username: ");
	        String username = sc.nextLine();

	        System.out.print("Enter Password: ");
	        String password = sc.nextLine();

	        Login l = new Login();

	        if (l.login(username, password)) {
	            System.out.println("Login Successful");
	        } else {
	            System.err.println("Invalid Username or Password");
	        }

	        sc.close();
	}

}
