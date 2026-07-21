package ecapsulation;
import java.util.Scanner;
public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Movie m = new Movie();
		System.out.println(" Enter Movie Name");
		String name=sc.nextLine();
		m.setMovieName(name);
		System.out.println(" Enter Rating");
		float rate=sc.nextFloat();
		m.setRating(rate);
		m.displayMovie();
		sc.close();
	}

}
