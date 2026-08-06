package exam;

public class Student extends User {

	@Override
	public void result() {

		if (getMarks() >= 35) {
			System.out.println("Result : Pass");
		} else {
			System.out.println("Result : Fail");
		}


	}}
