package methods;

public class SquareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Square sq=new Square();
   sq.square(8);
    
   Square sq2 =new Square();
    sq2.c=55;
    sq2.sq1();
    
    Square squ= new Square();
    squ.d=88;
    System.out.println(" Square "+squ.sq2());
    
    Square squ1=new Square();
   System.out.println( "Square :"+squ1.sq3(77));
	}

}
