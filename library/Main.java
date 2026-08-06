package library;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				User u;
				u = new Student();

				u.setBook("Java");
                u.setId(111);
				u.issue();
				u.show();
				u.fine();
				System.out.println("----------------");
				u = new Librarian();
				u.setBook("Java");
                u.setId(111);
				u.issue();
				u.show();
				u.fine();

			
	}

}
