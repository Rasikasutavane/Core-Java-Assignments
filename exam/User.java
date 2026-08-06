package exam;

public abstract class User {
	private String name;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void start() {
		System.out.println("Exam Started");
	}

	public void show() {
		System.out.println("Name : " + name);
		System.out.println("Marks : " + marks);
	}

	public abstract void result();

}
