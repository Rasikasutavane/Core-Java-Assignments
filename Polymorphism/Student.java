package plymorphism;

public class Student {
	int id;
    String name;
	public  Student() {
		id=0;
		name="Rasika";
	}
     Student(int id) {
    	 this.id=id;
     }
     Student(int id,String name){
    	 this.name=name;
    	 this.id=id;
     }
     void display() {
         System.out.println(id + " " + name);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
        Student s2 = new Student(101);
        Student s3 = new Student(102, "Rasika");

        s1.display();
        s2.display();
        s3.display();
    }

	}


