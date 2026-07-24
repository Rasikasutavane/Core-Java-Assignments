package multilevel;

public class C extends B{
	public void showC() {
		  System.out.println(" this is Show method of C class");
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C c= new C ();
       c.showA();
       c.showB();
       c.showC();
	}

}
