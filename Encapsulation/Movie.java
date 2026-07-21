package ecapsulation;

public class Movie {
private String movieName;
private float rating;
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public float getRating() {
	return rating;
}
public void setRating(float rating) {
	if( rating <10&&rating>=0) {
	this.rating = rating;}
	else {
		System.err.println("Invalid rating");
	}
}
public void displayMovie() {
	System.out.println(" Movie Name"+movieName);
	System.out.println(("Rating "+rating));
}



}
