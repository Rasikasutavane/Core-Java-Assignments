package inheritanceAnimal;

public class Cat extends Animal {
     
	public void meow() {
		System.out.println(" Cat meows");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Cat c= new Cat();
 c.eat();
 c.meow();
	}

}
