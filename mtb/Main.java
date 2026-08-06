package mtb;
public class Main {

    public static void main(String[] args) {

        User u;

        u = new Customer();

        u.setMovie("Pushpa 2");
        u.setSeatno(23);
        u.book();
        u.display();
        System.out.println("----------------");

        u = new Admin();
        u.setMovie("Pushpa 2");
        u.setSeatno(4);
        u.book();
        System.out.println(" Movie You Book :"+u.getMovie()+" Seat No. :"+u.getSeatno());
        System.out.println("Enjoy YOU movie Thankyou For Booking ");
        u.display();

    }

}