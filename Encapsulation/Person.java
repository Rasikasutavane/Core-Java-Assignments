package ecapsulation;

public class Person {
private int age;
private String name;

public void setName(String name) {
	
	this.name=name;
}
public String getName() {
	return name;
}
public void setAge(int age) {
	if(age>0&& age<=120 ) {
		this.age=age;	
	}
	else {
		System.out.println(" Enter valid Age");
	}
}
public int getAge() {
	
	return age;
}
}
