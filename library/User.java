package library;

public abstract class User {
	 private String book;
	    private int id;
		
		public String getBook() {
			return book;
		}

		public void setBook(String book) {
			this.book = book;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void show() {
			System.out.println("Book Name : " + book);
			System.out.println("Book Id : " + id);
		}

		public void issue() {
			System.out.println("Book Issued");
		}

		public abstract void fine();
}
