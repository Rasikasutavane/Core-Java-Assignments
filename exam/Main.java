package exam;

public class Main {
	

		public static void main(String[] args) {

			User u;

			u = new Student();

			u.setName("Rasika");
			u.setMarks(80);

			u.start();
			u.show();
			u.result();

			System.out.println("----------------");

			u = new Admin();

			u.setName("Admin");
			u.setMarks(0);

			u.start();
			u.show();
			u.result();
		}
	}

