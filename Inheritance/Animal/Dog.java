package inheritanceAnimal;

public class Dog extends Animal{
public void bark( ) {
	System.out.println(" Dog barks");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog();
d.eat();
d.bark();
	}

}
