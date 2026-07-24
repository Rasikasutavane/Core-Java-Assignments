package inheritanceAnimal;

public class Tiger extends Cat {
public void tiger() {
	System.out.println(" Tiger is Belongs to the Cat Family");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t= new Tiger();
		t.eat();
		t.meow();
		t.tiger();
	}

}
