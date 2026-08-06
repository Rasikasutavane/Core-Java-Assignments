package mtb;

public abstract class User implements Booking {
  private String movie;
  private int seatno;
  
  public String getMovie() {
	return movie;
  }
  public void setMovie(String movie) {
	this.movie = movie;
  }
  public int getSeatno() {
	return seatno;
  }
  public void setSeatno(int seatno) {
	this.seatno = seatno;
  }
  public void display() {
	  System.out.println(" Movie Name : "+movie);
	  System.out.println(" Seat No.:"+seatno);
	  
  }
	  public void cancle() {
		  System.err.println("Ticket Cancelled ");
	  }
	  public abstract void book();
  }

